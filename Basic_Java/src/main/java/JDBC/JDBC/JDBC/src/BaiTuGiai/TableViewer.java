package BaiTuGiai;

import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class TableViewer extends JFrame implements ItemListener {
    Connection conn;
    Statement stmt;
    JComboBox<String> tableList;
    JScrollPane tablePane;
    JTable dataTable;

    public TableViewer() {
        super("Table Viewer");

        // Kết nối đến cơ sở dữ liệu
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "xincamon@2005");
            
            stmt = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Tạo danh sách JComboBox để hiển thị tên bảng
        tableList = new JComboBox<>();
        tableList.addItemListener(this);
        loadTableNames(); // Load tên bảng vào danh sách JComboBox

        // Tạo JTable để hiển thị nội dung của bảng
        dataTable = new JTable();

        // Đặt JTable vào JScrollPane
        tablePane = new JScrollPane(dataTable);

        // Thêm các thành phần vào JFrame
        add(tableList, BorderLayout.NORTH);
        add(tablePane, BorderLayout.CENTER);

        // Thiết lập kích thước và hiển thị cửa sổ
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Load tên bảng từ cơ sở dữ liệu và thêm vào danh sách JComboBox
    private void loadTableNames() {
        try {
            DatabaseMetaData metaData = conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet tables = metaData.getTables(null, null, "%", types);
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                tableList.addItem(tableName);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String tableName = (String) tableList.getSelectedItem();
            if (isValidTableName(tableName)) {
                try {
                    String query = "SELECT * FROM " + tableName;
                    ResultSet rs = stmt.executeQuery(query);
                    dataTable.setModel(buildTableModel(rs));
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("Invalid table name: " + tableName);
            }
        }
    }

    private boolean isValidTableName(String tableName) {
        // Add your validation logic here
        // For example, you can query the database metadata to check if the table exists
        try {
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet tables = metaData.getTables(null, null, tableName, null);
            return tables.next(); // Return true if the table exists
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // Phương thức để tạo DefaultTableModel từ ResultSet
    private DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<Object>> data = new Vector<>();

        // Lấy tên cột
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // Lấy dữ liệu từ ResultSet
        while (rs.next()) {
            Vector<Object> row = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                row.add(rs.getObject(columnIndex));
            }
            data.add(row);
        }

        return new DefaultTableModel(data, columnNames);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TableViewer());
    }
}

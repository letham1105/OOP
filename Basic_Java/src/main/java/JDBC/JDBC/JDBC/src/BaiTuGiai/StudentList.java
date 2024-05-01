package BaiTuGiai;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class StudentList extends JFrame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/st";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "xincamon@2005";

    private JTable table;
    private DefaultTableModel model;

    public StudentList() {
        setTitle("Student List");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        displayStudents();

        setVisible(true);
    }

    private void displayStudents() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students ORDER BY Aver ASC");

            // Clear existing table data and columns
            model.setRowCount(0);
            model.setColumnCount(0);

            // Populate table with data from ResultSet
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentList::new);
    }
}

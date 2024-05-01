package BaiTuGiai;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentSearch extends JFrame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/st";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "xincamon@2005";

    private JTextField searchField;
    private JButton searchButton;
    private JTable table;
    private DefaultTableModel model;
    private String lastSearchKeyword = "";

    public StudentSearch() {
        setTitle("Student Search");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel searchPanel = new JPanel();
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Enter student name: "));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        add(searchPanel, BorderLayout.NORTH);

        model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = searchField.getText().trim();
                if (!name.equals(lastSearchKeyword)) {
                    lastSearchKeyword = name;
                    searchStudents(name);
                }
            }
        });

        setVisible(true);
    }

    private void searchStudents(String name) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Students WHERE Name LIKE ?");
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();

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

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No student found with that name.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentSearch::new);
    }
}

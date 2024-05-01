package BaiTuGiai;
import java.awt.BorderLayout;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import BaiTuGiai.AccountManager;

public class AccountManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/st";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "xincamon@2005";

    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    public AccountManager() {
        frame = new JFrame("Account Manager");
        frame.setSize(600, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        JPanel buttonPanel = new JPanel();
        JButton viewButton = new JButton("View");
        JButton deleteButton = new JButton("Delete");
        JButton editButton = new JButton("Edit");
        buttonPanel.add(viewButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        viewButton.addActionListener(e -> viewData());
        deleteButton.addActionListener(e -> deleteData());
        editButton.addActionListener(e -> editData());

        frame.setVisible(true);
    }

    private void viewData() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM Accounts");
            ResultSetMetaData rstmeta = rst.getMetaData();

            // Clear existing table data
            model.setColumnCount(0);
            model.setRowCount(0);

            // Populate table with data from ResultSet
            int numColumns = rstmeta.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                model.addColumn(rstmeta.getColumnLabel(i));
            }

            while (rst.next()) {
                Object[] row = new Object[numColumns];
                for (int i = 1; i <= numColumns; i++) {
                    row[i - 1] = rst.getString(i);
                }
                model.addRow(row);
            }

            rst.close();
            stm.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void deleteData() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frame, "Please select a row to delete.");
            return;
        }

        int id = Integer.parseInt((String) table.getValueAt(row, 0));
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Accounts WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            JOptionPane.showMessageDialog(frame, "Record deleted successfully.");
            viewData(); // Refresh table
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void editData() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frame, "Please select a row to edit.");
            return;
        }

        int id = Integer.parseInt((String) table.getValueAt(row, 0));
        String username = (String) table.getValueAt(row, 1);
        String password = (String) table.getValueAt(row, 2);
        String accessRights = (String) table.getValueAt(row, 3);

        // You can implement editing logic here, for example, opening a dialog for editing.
        // Then, update the record in the database with the new values.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AccountManager::new);
    }
}

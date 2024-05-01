package BaiTuGiai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.*;

public class DatabaseConfigApp extends JFrame {
    private JTextField usernameField;
    private JTextField passwordField;
    private JTextField urlField;
    private JTextField driverField;

    public DatabaseConfigApp() {
        super("Database Configuration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JTextField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel urlLabel = new JLabel("Database URL:");
        urlField = new JTextField();
        panel.add(urlLabel);
        panel.add(urlField);

        JLabel driverLabel = new JLabel("Driver:");
        driverField = new JTextField();
        panel.add(driverLabel);
        panel.add(driverField);

        JButton configButton = new JButton("Config");
        configButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveConfigToFile();
                loadTableNames(); // Load table names after saving configuration
            }
        });
        panel.add(configButton);

        add(panel);
        setVisible(true);
    }

    private void saveConfigToFile() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String url = urlField.getText();
        String driver = driverField.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("config.txt"))) {
            writer.write("Username=" + username + "\n");
            writer.write("Password=" + password + "\n");
            writer.write("URL=" + url + "\n");
            writer.write("Driver=" + driver + "\n");
            JOptionPane.showMessageDialog(this, "Configuration saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error occurred while saving configuration: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadTableNames() {
        JComboBox<String> tableList = new JComboBox<>();
        try {
            Class.forName(driverField.getText());
            Connection conn = DriverManager.getConnection(urlField.getText(), usernameField.getText(), passwordField.getText());
            DatabaseMetaData metaData = conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet tables = metaData.getTables(null, null, "%", types);
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                tableList.addItem(tableName);
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while loading table names: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        JFrame frame = new JFrame("Table Viewer");
        frame.setLayout(new BorderLayout());
        
        JScrollPane tablePane = new JScrollPane(tableList);
        frame.add(tablePane, BorderLayout.CENTER);
        
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DatabaseConfigApp();
            }
        });
    }
}

package BaiTuGiai;

import javax.swing.*;
import BaiTuGiai.RegistrationLoginForm;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationLoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> accessRightsField;
    private JButton registerButton;
    private JButton loginButton;

    private Connection conn;

    public RegistrationLoginForm() {
        super("Registration & Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        // Kết nối đến cơ sở dữ liệu
        connectToDatabase();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel accessRightsLabel = new JLabel("Access Rights:");
        String[] accessRights = {"Admin", "Teacher", "Student"};
        accessRightsField = new JComboBox<>(accessRights);
        panel.add(accessRightsLabel);
        panel.add(accessRightsField);

        registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        panel.add(registerButton);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/st";
        String username = "root";
        String password = "xincamon@2005";

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to the database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registerUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String accessRights = (String) accessRightsField.getSelectedItem();

        try {
            // Kiểm tra xem tên người dùng đã tồn tại trong cơ sở dữ liệu chưa
            String checkQuery = "SELECT COUNT(*) AS count FROM Accounts WHERE username = ?";
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, username);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt("count");
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Thêm người dùng mới vào cơ sở dữ liệu
            String query = "INSERT INTO Accounts (username, password, access_rights) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, accessRights);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(this, "User registered successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while registering user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void loginUser() {
        // Lấy dữ liệu từ các trường nhập vào
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Kiểm tra thông tin đăng nhập
        try {
            // Thực hiện truy vấn SQL để kiểm tra thông tin đăng nhập
            String query = "SELECT * FROM Accounts WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String accessRights = resultSet.getString("access_rights");
                JOptionPane.showMessageDialog(this, "Login successful! Access Rights: " + accessRights);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while logging in: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationLoginForm();
            }
        });
    }
}


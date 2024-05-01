package BaiTuGiai;

import BaiTuGiai.StudentList;
import java.sql.*;
import BaiTuGiai.StudentSearch;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class StudentManagement extends JFrame implements ActionListener, MouseListener {
    Connection conn;
    PreparedStatement stm;
    ResultSet rst;

    Vector<Vector<String>> vData = new Vector<>();
    Vector<String> vTitle = new Vector<>();
    JScrollPane tableResult;
    DefaultTableModel model;
    JTable tb = new JTable();

    JButton edit, delete, insert, searchButton, sortAndViewButton;
    int selectedrow = 0;

    public StudentManagement(String s) {
        super(s);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database and create a Connection object
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "xincamon@2005");

            JPanel p = new JPanel();

            insert = new JButton("Insert");
            insert.addActionListener(this);

            searchButton = new JButton("Search");
            searchButton.addActionListener(this);

            sortAndViewButton = new JButton("Sort and View");
            sortAndViewButton.addActionListener(this);

            edit = new JButton("Edit");
            edit.addActionListener(this);

            delete = new JButton("Delete");
            delete.addActionListener(this);

            p.add(insert);
            p.add(searchButton);
            p.add(sortAndViewButton);
            p.add(edit);
            p.add(delete);

            this.add(p, BorderLayout.SOUTH);

            JMenuBar menuBar = new JMenuBar();
            JMenu systemMenu = new JMenu("System");

            // Submenu "Accounts"
            JMenu accountsSubMenu = new JMenu("Accounts");
            JMenuItem signUpItem = new JMenuItem("Sign up");
            signUpItem.addActionListener(this);
            JMenuItem signInItem = new JMenuItem("Sign in");
            signInItem.addActionListener(this);
            JMenuItem userAccountsItem = new JMenuItem("User accounts");
            userAccountsItem.addActionListener(this);
            accountsSubMenu.add(signUpItem);
            accountsSubMenu.add(signInItem);
            accountsSubMenu.add(userAccountsItem);

            // Submenu "About"
            JMenuItem aboutItem = new JMenuItem("About");
            aboutItem.addActionListener(this);

            systemMenu.add(accountsSubMenu);
            systemMenu.add(aboutItem);

            menuBar.add(systemMenu);
            setJMenuBar(menuBar);

            reload();

            model = new DefaultTableModel(vData, vTitle);
            tb = new JTable(model);
            tb.addMouseListener(this);

            tableResult = new JScrollPane(tb);
            this.getContentPane().add(tableResult, BorderLayout.NORTH);

            this.setSize(400, 300);
            this.setLocation(200, 100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void reload() {
        try {
            vTitle.clear();
            vData.clear();

            stm = conn.prepareStatement("SELECT * FROM students");
            rst = stm.executeQuery();
            ResultSetMetaData rstmeta = rst.getMetaData();
            int num_column = rstmeta.getColumnCount();

            for (int i = 1; i <= num_column; i++) {
                vTitle.add(rstmeta.getColumnLabel(i));
            }

            while (rst.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= num_column; i++) {
                    row.add(rst.getString(i));
                }
                vData.add(row);
            }
            rst.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete() {
        try {
            Vector<String> st = vData.elementAt(selectedrow);
            String sql = "DELETE FROM students WHERE id = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, st.elementAt(0));
            stm.executeUpdate();
            vData.remove(selectedrow);
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Sign in")) {
            // Gọi và mở cửa sổ đăng nhập
            new RegistrationLoginForm();
        }
        if (actionCommand.equals("Sign up")) {
            new RegistrationLoginForm();
        }
        
        if (actionCommand.equals("User accounts")) {
            new AccountManager();
        }
        // Kiểm tra quyền truy cập của người dùng
        String accessRights = ""; // Giả sử accessRights đã được xác định từ người dùng khi đăng nhập

        // Admin có quyền truy cập tất cả các chức năng
        if (accessRights.equals("Admin")) {
            // Xử lý các chức năng cho Admin
            if (actionCommand.equals("Delete")) {
                delete();
            } else if (actionCommand.equals("Insert")) {
                new UpdateForm("Insert form", this, "", "", "0", "0", "0");
            } else if (actionCommand.equals("Edit")) {
                Vector<String> st = vData.elementAt(selectedrow);
                new UpdateForm("Edit form", this, st.elementAt(0), st.elementAt(1), st.elementAt(2), st.elementAt(3), st.elementAt(4));
            } else if (actionCommand.equals("Sign up")) {
                new RegistrationLoginForm();
            } else if (actionCommand.equals("Sign in")) {
                new RegistrationLoginForm();
            } else if (actionCommand.equals("User accounts")) {
                new AccountManager();
            } else if (actionCommand.equals("About")) {
                JOptionPane.showMessageDialog(this, "Thông tin về tác giả, chương trình...");
            } else if (actionCommand.equals("Search")) {
                new StudentSearch();
            } else if (actionCommand.equals("Sort and View")) {
                new StudentList();
            }
        }
        // Teacher có quyền truy cập tất cả các chức năng với bảng Students, và một số chức năng với bảng Accounts
        else if (accessRights.equals("Teacher")) {
            // Xử lý các chức năng cho Teacher
            if (actionCommand.equals("Delete")) {
                delete();
            } else if (actionCommand.equals("Insert")) {
                new UpdateForm("Insert form", this, "", "", "0", "0", "0");
            } else if (actionCommand.equals("Edit")) {
                Vector<String> st = vData.elementAt(selectedrow);
                new UpdateForm("Edit form", this, st.elementAt(0), st.elementAt(1), st.elementAt(2), st.elementAt(3), st.elementAt(4));
            } else if (actionCommand.equals("Search")) {
                new StudentSearch();
            } else if (actionCommand.equals("Sort and View")) {
                new StudentList();
            }
        }
        // Student chỉ có quyền truy cập một số chức năng với bảng Students và Accounts
        else if (accessRights.equals("Student")) {
            // Xử lý các chức năng cho Student
            if (actionCommand.equals("Search")) {
                new StudentSearch();
            }
        }
    }


    public void mouseClicked(MouseEvent e) {
        selectedrow = tb.getSelectedRow();
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new StudentManagement("Student Management");
    }
}

class UpdateForm extends JFrame implements ActionListener {
    JLabel namelb, mathlb, physlb, chemlb, errorlb, errordetails;
    JTextField name, math, phys, chem;
    JButton ok, cancel;
    StudentManagement mst;
    String id;

    public UpdateForm(String s, StudentManagement st, String i, String na, String m, String ph, String ch) {
        super(s);
        mst = st;

        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(6, 2));

        namelb = new JLabel("Name");
        name = new JTextField(na);
        cont.add(namelb);
        cont.add(name);

        mathlb = new JLabel("Math");
        math = new JTextField(m);
        cont.add(mathlb);
        cont.add(math);

        physlb = new JLabel("Physics");
        phys = new JTextField(ph);
        cont.add(physlb);
        cont.add(phys);

        chemlb = new JLabel("Chemistry");
        chem = new JTextField(ch);
        cont.add(chemlb);
        cont.add(chem);

        errorlb = new JLabel("");
        errordetails = new JLabel("");
        errorlb.setVisible(false);
        errordetails.setVisible(false);
        cont.add(errorlb);
        cont.add(errordetails);

        ok = new JButton("Ok");
        cancel = new JButton("Cancel");
        cont.add(ok);
        cont.add(cancel);
        ok.addActionListener(this);
        cancel.addActionListener(this);

        this.setSize(230, 200);
        this.setLocation(250, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

        id = i;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Ok")) {
            insertDB();
        } else {
            this.dispose();
        }
    }

    public void insertDB() {
        if (name.getText().equals("") || math.getText().equals("") || phys.getText().equals("")
                || chem.getText().equals("")) {
            errorlb.setText("Error");
            errordetails.setText("empty value");
            errorlb.setForeground(Color.RED);
            errordetails.setForeground(Color.RED);
            errorlb.setVisible(true);
            errordetails.setVisible(true);
        } else {
            try {
                String na = name.getText();
                float m = Float.parseFloat(math.getText());
                float ph = Float.parseFloat(phys.getText());
                float ch = Float.parseFloat(chem.getText());
                String sql = "";
                if (this.getTitle().equals("Insert form")) {
                    sql = "INSERT INTO students(Name, Math, Phys, Chem, Aver) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement stmt = mst.conn.prepareStatement(sql);
                    stmt.setString(1, na);
                    stmt.setFloat(2, m);
                    stmt.setFloat(3, ph);
                    stmt.setFloat(4, ch);
                    stmt.setFloat(5, (m + ph + ch) / 3);
                    stmt.executeUpdate();
                } else {
                    sql = "UPDATE students SET Name=?, Math=?, Phys=?, Chem=?, Aver=? WHERE ID=?";
                    PreparedStatement stmt = mst.conn.prepareStatement(sql);
                    stmt.setString(1, na);
                    stmt.setFloat(2, m);
                    stmt.setFloat(3, ph);
                    stmt.setFloat(4, ch);
                    stmt.setFloat(5, (m + ph + ch) / 3);
                    stmt.setString(6, id);
                    stmt.executeUpdate();
                }
                mst.reload();
                mst.model.fireTableDataChanged();
                this.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

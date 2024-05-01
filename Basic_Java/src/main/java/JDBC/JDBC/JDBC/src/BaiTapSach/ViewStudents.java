package BaiTapSach;

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class ViewStudents {
    public static void main(String[] args) {
        Vector<Vector<String>> vData = null;
        Vector<String> vTitle = null;

        try {
            // Nạp driver
            // Nạp driver
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // Kết nối đến cơ sở dữ liệu và tạo đối tượng Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "xincamon@2005");

            Statement stm = conn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM students");
            ResultSetMetaData rstmeta = rst.getMetaData();
            int num_column = rstmeta.getColumnCount();

            // Chuẩn bị dữ liệu để tạo bảng (JTable) hiển thị thông tin
            vTitle = new Vector<>(num_column);
            for (int i = 1; i <= num_column; i++) {
                vTitle.add(rstmeta.getColumnLabel(i));
            }

            // vData chứa nội dung của bảng
            vData = new Vector<>(10, 10);
            while (rst.next()) {
                Vector<String> row = new Vector<>(num_column);
                for (int i = 1; i <= num_column; i++) {
                    row.add(rst.getString(i));
                }
                vData.add(row);
            }

            rst.close();
            stm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Tạo bảng để chứa thông tin truy vấn từ csdl
        JScrollPane tableResult = new JScrollPane(new JTable(vData, vTitle));

        // Tạo cửa sổ chứa bảng dữ liệu
        JFrame f = new JFrame();
        f.setSize(600, 480);
        f.setContentPane(tableResult);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

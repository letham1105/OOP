package BaiTapSach;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String[] names = {"Tran C", "Le D", "Ha E"};
        float[] math = {7, 8, 7};
        float[] phys = {8, 9, 8};
        float[] chem = {6, 7, 9};

        try {
            // Nạp driver
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // Kết nối đến cơ sở dữ liệu và tạo đối tượng Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "xincamon@2005");

            // Tạo đối tượng PreparedStatement để gửi câu lệnh SQL
            PreparedStatement ps = conn.prepareStatement("INSERT INTO students (Name, Math, Phys, Chem, Aver) VALUES (?, ?, ?, ?, ?)");

            // Thiết lập giá trị cho các đối số (dấu ?) của PreparedStatement
            for (int i = 0; i < names.length; i++) {
                ps.setString(1, names[i]);
                ps.setFloat(2, math[i]);
                ps.setFloat(3, phys[i]);
                ps.setFloat(4, chem[i]);
                ps.setFloat(5, (math[i] + phys[i] + chem[i]) / 3);

                // Gọi hàm ra lệnh cập nhật dữ liệu
                ps.executeUpdate();
            }

            // Truy vấn thông tin từ bảng students
            ResultSet rs = ps.executeQuery("SELECT * FROM students");
            // Tạo ResultSetMetaData để lấy thông tin số cột của ResultSet
            ResultSetMetaData rsm = rs.getMetaData();
            int col_num = rsm.getColumnCount();

            // Lấy tên cột của bảng students từ đối tượng rsm
            for (int i = 1; i <= col_num; i++) {
                System.out.print(rsm.getColumnLabel(i) + "\t");
            }
            System.out.println("");

            // Hiển thị thông tin truy vấn được từ bảng students
            while (rs.next()) {
                for (int i = 1; i <= col_num; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println("");
            }

            // Đóng PreparedStatement và Connection
            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

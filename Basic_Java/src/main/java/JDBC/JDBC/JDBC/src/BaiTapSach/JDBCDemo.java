package BaiTapSach;
import java.sql.*;

public class JDBCDemo {
    public static void main(String args[]) {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // Kết nối đến cơ sở dữ liệu và tạo đối tượng Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "xincamon@2005");

            Statement sm = conn.createStatement();

            // Thêm thông tin vào bảng students
            sm.executeUpdate("INSERT INTO students VALUES(9, 'NVQuan', 8, 7, 9, (8+7+9)/3)");
            sm.executeUpdate("INSERT INTO students VALUES(10, 'PVThuan', 8, 5, 9, (8+5+9)/3)");

            // Truy vấn thông tin từ bảng students
            ResultSet rs = sm.executeQuery("SELECT * FROM students");
            // Tạo ResultSetMetaData để lấy thông tin số cột của ResultSet
            ResultSetMetaData rsm = rs.getMetaData();
            int col_num = rsm.getColumnCount();
            // Lấy tên cột của bảng students từ đối tượng rsm
            for (int i = 1; i <= col_num; i++)
                System.out.print(rsm.getColumnLabel(i) + "\t");
            System.out.println("");
            // Hiển thị thông tin truy vấn được từ bảng students
            while (rs.next()) {
                // Mỗi hàng của ResultSet duyệt các ô để lấy dữ liệu
                for (int i = 1; i <= col_num; i++)
                    System.out.print(rs.getString(i) + "\t");
                // Xuống dòng mới
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

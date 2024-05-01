package BaiTapSach;
import java.sql.*;

public class TableNames {
    public static void main(String args[]) {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            // Kết nối đến cơ sở dữ liệu và tạo đối tượng Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/st", "root", "xincamon@2005");

            // Tạo đối tượng DatabaseMetaData để lấy thông tin của cơ sở dữ liệu
            DatabaseMetaData dbm = conn.getMetaData();

            // Lấy tên các bảng của cơ sở dữ liệu
            ResultSet rs = dbm.getTables(null, null, "%", null);

            // Cột thứ 3 chứa tên bảng
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

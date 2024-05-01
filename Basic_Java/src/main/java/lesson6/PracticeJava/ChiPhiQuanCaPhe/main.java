package LaptrinhJava.ChiPhiQuanCaPhe;

public class main {
    public static void main(String[] args) {
        HoadonCaPhe hd = new HoadonCaPhe(" Trung Nguyen", 100000, 1.5);
        HoadonCaPhe hd2 = new HoadonCaPhe(" Trung Nguyen", 100000, 5.5);
        System.out.println(" Tong Tien: " +hd.tinhTongTien());
        System.out.println(" Kiem Tra Khoi Luong > 2kg "+ hd.kiemTraKhoiLuongLOnHon(2
        ));
        System.out.println(" Kiem Tra Tong Tien Lon Hon 500k "+ hd.kiemTraTongTienLonHon500k());
        System.out.println(" Giam gia cua Hd: " + hd.giamGia(10));
        System.out.println(" Giam gia cua hd2: " + hd2.giamGia(10));
        System.out.println(" Sau Giam Gia cua HD2: " + hd2.giaSauKhiGiam(10));

    }
}

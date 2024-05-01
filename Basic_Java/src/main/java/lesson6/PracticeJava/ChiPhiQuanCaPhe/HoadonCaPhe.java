package LaptrinhJava.ChiPhiQuanCaPhe;

public class HoadonCaPhe {

    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double KhoiLuong;

    public HoadonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        KhoiLuong = khoiLuong;
    }
    public double tinhTongTien(){
        return this.giaTien1Kg * this.KhoiLuong;
    }
    public boolean kiemTraKhoiLuongLOnHon ( double kl ){
        return this.KhoiLuong > kl;
    }
    public boolean kiemTraTongTienLonHon500k(){
        return this.tinhTongTien() > 500000;
    }
    public double giamGia(double x){
        if ( this.tinhTongTien() > 500000){
            return (x/100)*this.tinhTongTien();
        }else {
            return 0;
        }
    }
    public double giaSauKhiGiam(double x){
        return this.tinhTongTien() - this.giamGia(x);
    }
}

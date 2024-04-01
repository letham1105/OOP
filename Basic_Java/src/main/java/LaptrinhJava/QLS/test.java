package LaptrinhJava.QLS;

public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new  Ngay(15,3,2022);
        Ngay ngay2 = new Ngay(23,4,2005);
        Ngay ngay3 = new Ngay (25,12,1997);

        TacGia tacGia1 = new TacGia("Tung Tv",ngay1);
        TacGia tacGia2 = new TacGia("Tuan Le", ngay2);
        TacGia tacGia3 = new TacGia("Tram le ", ngay3);

        Sach sach1 = new Sach("Lap Trinh C", 5000, 2023,tacGia1);
        Sach sach2 = new Sach("Lap Trinh Java", 6000, 2022,tacGia2);
        Sach sach3 = new Sach("Lap Trinh Python", 7000, 2023,tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println(" So Sanh NXB sach 1 va sach 3: "
        + sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println(" So Sanh NXB sach 2 va sach 3: "
        + sach2.kiemTraCungNamXuatBan(sach3));

        System.out.println(" Sach 1 giam 10% "+ sach1.giaBanSauKhiGiam(10));
        System.out.println(" Sach 2 giam 20% "+ sach2.giaBanSauKhiGiam(10));
        System.out.println(" Sach 3 giam 30% "+ sach3.giaBanSauKhiGiam(10));






    }
}

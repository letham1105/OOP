package LaptrinhJava.GetAndSet;

public class main {
    public static void main(String[] args) {
        MyDate md = new MyDate(31, 1, 2021);
        MyDate md1 = new MyDate(23, 2, 2025);
        MyDate md2 = new MyDate(31, 1, 2021);
        System.out.println(" Day = " + md.getDay());
        md.setDay(23);
        System.out.println(" Day = " + md.getDay());
        System.out.println(" Month = " + md.getMonth());
        System.out.println(" Year= " + md.getYear());
        // Ham ToString
        System.out.println(md);
//         Phuong Thuc So Sanh equals And hashcode
//        if (md == md2) {
//            System.out.println(" md1 = md3 ");
//        } else {
//            System.out.println("md1 != md3 ");
//        }
        // dung phep so sanh de so sanh se tra ve ket qua sai
        // dung phuong phap equals
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

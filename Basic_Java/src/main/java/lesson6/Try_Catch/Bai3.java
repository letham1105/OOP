package Try_Catch;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String id = inputID(sc);
            String fullname = FullName(sc);
            int age = Age(sc);

            System.out.println(" ID: " + id);
            System.out.println(" Họ Và Tên: " + fullname);
            System.out.println(" Tuổi: " + age);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
           sc.close();
        }
    }
    public static String inputID(Scanner sc) throws Exception {
        System.out.println(" Nhap ID (6v ky tu) ");
        String id = sc.nextLine();
        if(id.length() !=6){
            throw new Exception(" ID phải có đúng 6 ký tự");
        }
        return id;
    }
    public static String FullName (Scanner sc) throws Exception{
        System.out.println(" Nhập Họ Tên (2 từ trở lên)");
        String fullname =sc.nextLine();

        String[] nameParts = fullname.split(" " );
        if(nameParts.length <2){
            throw new Exception(" Họ Và Tên phải có ít nhất 2 từ");
        }
        return fullname;
    }
    public static int Age(Scanner sc) throws Exception{
        System.out.println(" Nhập Tuổi (lớn hơn hặc bằng 19)");
        int age = sc.nextInt();
        if (age <19){
            throw new Exception(" Tuổi phải lớn hơn hoặc bằng 19");
        }
        return age;
    }
}

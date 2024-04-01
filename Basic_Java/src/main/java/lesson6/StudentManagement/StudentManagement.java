package lesson6.StudentManagement;

import java.util.*;

public class StudentManagement {
    // dung de chua danh sach sinh vien
    Vector list = new Vector();
    public StudentManagement(){
        while (true){
            System.out.println("* -CHUONG TRING QUAN LI SINH VIEN-*");
            System.out.println(" -Chuc nang chinh chuong trinh-");
            System.out.println(" 1.Nhap danh sach sinh vien ");
            System.out.println(" 2.Xem danh sach sinh vien ");
            System.out.println(" 3.Sap xep danh sach sinh vien tang dan diem trung binh ");
            System.out.println(" 4.Tim sinh vien theo ten ");
            System.out.println(" 5.Thoat ");
            System.out.println(" ------------------");
            //nhap mot so tu ban phim
            int num;
            Scanner keyboard = new Scanner (System.in);
            System.out.print(" Nhap mot so de chon chuc nang: ");
            num = keyboard.nextInt();
            //kiem tra va goi chuc nang tuong ung
            switch (num){
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                break;
                case 3:
                    sort();
                break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println(" ----- Chuong trinh ket thuc ------");
                    return;
            }

        }
    }
    // nhap danh sach sinh vien
    public void input(){
        // nhap so luong sinh vien cho danh sach
        int num;
        Scanner keyboard = new Scanner (System.in);
        System.out.println(" Nhap so luong sinh vien: ");
        num = keyboard.nextInt();
        //nhap thong tin cho moi sinh vien
        for ( int i=1; i<=num; i++){
            System.out.println(" Nhap thong tin cho sinh vien thu: "+i);
            System.out.println(" ID");
            int id = Integer.parseInt(keyboard.next());
            keyboard.nextLine();
            System.out.println(" Ten: ");
            String name = keyboard.nextLine();
            System.out.println(" Diem trung binh: ");
            float aver = keyboard.nextFloat();
        // sau khi nhap thong tin, tao doi tuong sinh vien
        Student st = new Student(id, name, aver);
        //Luu doi tuong sinh vien vao danh sach
            list.add(st);
        }
        System.out.println(" \n--------\n");
    }
    //xem danh sach sinh vien
    public void view(){
        // hien thi danh sach sinh vien
        System.out.println(" thong tin danh sach sinh vien ");
        // lay sinh vien tu danh sach vector va luu tru o vEnum
        Enumeration vEnum = list.elements();
        // duyet qua tung phan tu cua num
        int i=1;
        // chua het phan tu
        while ( vEnum.hasMoreElements()){
         //lay phan tu tu Enum ep lai kieu student
         Student sts = ( Student) vEnum.nextElement();
         //hien thi thong tin sinh vien
            System.out.println("   "+i+" .ID="+sts.getId()+",Ten="+sts.getName()+",Diem trung binh="+sts.getAver());
            i++;
        }
        System.out.println("\n--------\n");
    }
    //sap xep danh sach theo chieu tang dan cua diem trung binh su dung ham sort cua lop Arrays
    public void sort(){
        // Do du lieu tu vector vao mang de goi ham sort sap xep mang
        Student[] sts = new Student[list.size()];
        int index =0;
        Enumeration vEnum = list.elements();
        while (vEnum.hasMoreElements()){
            sts[index] = ( Student) vEnum.nextElement();
            index++;
        }
        //sap xep vao mang
        Arrays.sort(sts);
        System.out.println(" \n--Danh sach sinh vien sau khi sap xep--");
        for( index =0; index < sts.length; index++){
            // hien thi thong tin sau khi duoc sap xep
            System.out.println("    "+(index+1)+".ID="+sts[index].getId()+",Ten="+sts[index].getName()+",Diem trung binh="+sts[index].getAver());
        }
        System.out.println("\n-------------\n");
    }
    //tim kiem sinh vien theo ten
    public void search(){
        //Nhap ten sinh vien can tim kiem
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Nhap ten sinh vien can tim: ");
        String name = keyboard.nextLine();
        //duyet tung phan tu cua mang de so sanh ten tim kiem
        Enumeration vEnum = list.elements();
        System.out.println(" \n--Thong tin tim kiem duoc--");
        while (vEnum.hasMoreElements()){
            Student sts =(Student) vEnum.nextElement();
          // Neu ten sinh vien chua chuoi nhap vao thi hien thi thong tin doi tuong sinh vien
          if (sts.getName().indexOf(name)!=-1)
              System.out.println(" ID= " +sts.getId()+",Ten="+sts.getName()+",Diem trung binh="+sts.getAver());
        }
        System.out.println("\n----------\n");
    }

    public static void main(String[] args) {
        new StudentManagement();
    }
}
class Student implements Comparable{
    private int id;
    private String name;
    private float aver;

    public Student() {
       name = new String("");
       id=0;
       aver=0;
    }
    //ham khoi tao 3 doi so
    public Student (int i, String n, float a){
        id =i;
        name =n;
        aver =a;
    }
    //ham lay gia tri name
    public String getName(){
        return name;
    }
    //ham lay gia tri id
    public int getId(){
        return id;
    }
    //ham lay gia tri Aver

    public float getAver() {
        return aver;
    }
    //ham so sanh 2 doi tuong student phuc vu sap xep
    public int compareTo(Object other){
        Student otherRect =(Student)other;
        return (int)(this.aver-otherRect.aver);
    }
}

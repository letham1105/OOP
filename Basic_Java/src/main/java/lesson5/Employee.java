package lesson5;
class Person
{
    private String name;
    private int age;
    private String address;
    // phuong thuc khoi tao
    public Person (String name, int age, String address)
    {
        // khoi tao gia tri cho cac thuoc tinh cua doi tuong hien dang goi phuong thuc nay
        this.name = name;
        this.age =age;
        this.address = address;
    }
    // hien thi thong tin
    public void display()
    {
        System.out.println("Nhan vien" +name+"," + age+" tuoi, tai dia chi " + address);
    }
}
// tao lop employee ke thua lop Person
public class Employee extends person
{
    // tao them hai thuoc tinh cho Employee
    private float salary;
    private float rate;
    // dinh nghia ham khoi tao cho lop Employee
    public Employee (String name, int age, String address, float salary, float rate)
    {
        // goi ham khoi tao cua lop person de khoi tao thuoc tinh
        super (name, age, address);
        // khoi tao thuoc tinh cua employee
        this.salary = salary;
        this.rate = rate;
    }
    // dinh nghia ham tinh tong luong
    public float totalSalary()
    {
        return salary* rate;
    }
    // dinh nghia ham hien thi thong tin cua employee
    public void display()
    {
        // goi ham display cua lop person de hien thi name, age, va address
        super.display();
        // hien thi thong tin luong
        System.out.println(" co tong luong la: " +totalSalary());
    }

    public static void main(String[] args) {
        // tao doi tuong cua lop employee
        Employee A = new Employee(" Dung", 30, "Quang Nam", 11050,366f);
        // hien thi thong tin cua A
        A.display();
    }
}


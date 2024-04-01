package lesson6.InformationOfEmployee;

public class Employee extends Person {
    private float salary;
    private float rate;

    public Employee(String name, int age, String address, float salary, float rate) {
        super(name, age, address);
        this.salary = salary;
        this.rate = rate;
    }
    public float totalSalary(){
        return salary*rate;
    }
    public void display(){
        super.Display();
        System.out.println(" Co Tong Luong La: " +totalSalary());
    }

    public static void main(String[] args) {
        Employee A = new Employee("Dung",30, " Quang Nam",11050, 3.66f );
        A.display();
    }
}

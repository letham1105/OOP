package lesson2;

class Employee {
    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setId(String val) {
        id = val;
    }

    public String getId() {
        return id;
    }

    public void details() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String title;
    private double positionAllowance;

    public Manager(String id, String name, String department, double salary, String title, double positionAllowance) {
        super(id, name, department, salary);
        this.title = title;
        this.positionAllowance = positionAllowance;
    }

    public void setTitle(String val) {
        title = val;
    }

    public String getTitle() {
        return title;
    }

    public void details() {
        super.details();
        System.out.println("Title: " + title);
        System.out.println("Position Allowance: " + positionAllowance);
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        Employee A = new Employee("VKU01", "David Tho", "Academic Office", 10000);
        Manager B = new Manager("VKU02", "John Phap", "Steering Board", 10000, "Rector", 1000);

        System.out.println("Details for Employee A:");
        A.details();

        System.out.println("---------");

        System.out.println("Details for Manager B:");
        B.details();
    }
}

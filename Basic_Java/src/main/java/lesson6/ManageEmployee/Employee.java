package lesson6.ManageEmployee;

public  abstract class Employee {
    private String name;
    private double age;
    private double hourRate;

    public Employee(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }
    public abstract double salary ( double hours );

    public String getName() {
        return name;
    }

    public double getHourRate() {
        return hourRate;
    }
    public String toString(){
        return " name= " + name + " age = " + age + " Hour Rate =" + hourRate;
    }
}
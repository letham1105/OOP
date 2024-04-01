package lesson6.ManageEmployee;

public class Manager  extends  Employee{
    public Manager(String name, double age, double hourRate) {
        super(name, age, hourRate);
    }
    public double salary ( double hours )
    {
        return hours * this.getHourRate()* 1.2;
    }
}

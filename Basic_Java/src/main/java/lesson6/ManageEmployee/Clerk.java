package lesson6.ManageEmployee;

public class Clerk extends Employee {
    public Clerk(String name, double age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double salary(double hours) {
        return hours * this.getHourRate() * 0.8;
    }
}

package lesson6.ManageEmployee;

public class AbstractEmployee {
    public static void main(String[] args) {
        Employee vec[] = { new Manager( " Huynh Cong Phap ", 45, 104),
        new Clerk("John Le ", 26, 110), new Manager(" David Huynh ", 42, 120), new Manager(" Marry Nguyen ", 34, 120)};
        double hours[] = { 140, 150, 130, 180};
        double total = 0;
        for (int index = 0; index < vec.length; index ++)
        {
            total += vec[index].salary(hours[index]);
            System.out.println(vec[index]);
        }
        System.out.println(" The total payment of the the employee is " +total);
    }
}

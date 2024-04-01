package lesson6.Vehicle;

public class VehicleInterface {
    public static void main(String[] args) {
        // creating an inatance of Bicycle
        // doing some operations
        Motobike bike = new Motobike ( "Honda", 100, 4, 2);
        bike.changeGear(2);
        bike.speedUp(3);
        bike.brake(1);
        System.out.println(" Motobike: ");
        bike.printStates();
        //creating instance of the bikes
        Car car = new Car(" Mitsubishi", 300, 6,4);
        car.changeGear(1);
        car.speedUp(4);
        car.brake(3);
        System.out.println("Car:");
        car.printStates();
    }
}

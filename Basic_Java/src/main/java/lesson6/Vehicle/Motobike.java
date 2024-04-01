package lesson6.Vehicle;

public class Motobike implements Vehicle{
    private String brand;
    private int speed;
    private int gear;
    private int wheels;

    public Motobike(String brand, int speed, int gear, int wheels) {
        this.brand = brand;
        this.speed = speed;
        this.gear = gear;
        this.wheels = wheels;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment ) {
          speed = speed + increment;
    }

    @Override
    public void brake(int decrement ) {
   speed = speed - decrement;
    }
    public void printStates (){
        System.out.println(" Brand: " +brand+", wheels: "+wheels+",speed: "+speed+" gear: "+gear);
    }
}

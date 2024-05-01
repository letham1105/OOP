package Shape;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }
    double area(){
        return side * side;
    }
    double perimeter(){
        return 4 * side;
    }
    void draw(){
        System.out.println(" Drawing a square ");
    }
}

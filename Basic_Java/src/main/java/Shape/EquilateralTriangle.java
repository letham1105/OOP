package Shape;

public class EquilateralTriangle extends Shape{
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return (Math.sqrt(3)/4*side*side);
    }

    @Override
    double perimeter() {
        return 3*side;
    }

    @Override
    void draw() {
        System.out.println("Drawing an equilateral triangle");
    }
}

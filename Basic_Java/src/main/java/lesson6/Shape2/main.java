package Shape;

public class main {
    public static void main(String[] args) {
        Square sq = new Square(5);
        Circle circle = new Circle(3);
        EquilateralTriangle triangle = new EquilateralTriangle(4);
        System.out.println(" Square area: " + sq.area());
        System.out.println("Circle area: " +circle.area());
        System.out.println("Triangle area: "+triangle.area());

        System.out.println(" Square perimeter: "+ sq.perimeter());
        sq.draw();
        System.out.println(" Circle perimeter:" +circle.perimeter());
        circle.draw();
        System.out.println(" Triangle perimeter: " +triangle.perimeter());
        triangle.draw();



    }
}

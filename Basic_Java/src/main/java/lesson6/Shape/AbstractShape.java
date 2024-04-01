package lesson6.Shape;

public class AbstractShape {
    public static void main(String[] args) {
        Shape vec[] = { new Circle(5), new Rectangle(4,5), new Circle(4), new Rectangle(7,8)};
        for (int index= 0; index < vec.length; index ++){
            System.out.println(vec[index]);

        }
    }
}

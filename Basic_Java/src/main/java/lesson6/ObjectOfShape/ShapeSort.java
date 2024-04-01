package lesson6.ObjectOfShape;

import java.util.Arrays;

public class ShapeSort {
    public static void main(String[] args) {
        Shape vec[] = new Shape[10];
        for (int index = 0; index < vec.length; index++) {
            switch ((int) (4 * Math.random())) {
                case 1:
                    vec[index] = new Rectangle(1000 * Math.random(), 1000 * Math.random());
                    break;
                case 2:
                    vec[index] = new Circle(1000 * Math.random());
                    break;
                default:
                    vec[index] = new EquilateralTriangle(1000 * Math.random());
            }
        }
        Arrays.sort(vec);
        for (int index = 0; index < vec.length; index++) {
            System.out.println(vec[index]);
        }
    }
}

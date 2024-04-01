package lesson1;
import java.util.Scanner;
public class Exercise8 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();
	        System.out.print("Enter the height of the rectangle: ");
	        double height = scanner.nextDouble();
	        double area = width * height;
	        double perimeter = 2 * (width + height);
	        System.out.println("Rectangle Area: " + area);
	        System.out.println("Rectangle Perimeter: " + perimeter);
	    }
	}

package lesson1;
import java.util.Scanner;
import java.lang.Math;
public class Exercise6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number (n): ");
	        double n = scanner.nextDouble();
	        double sine = Math.sin(n);
	        double cosine = Math.cos(n);
	        double squareRoot = Math.sqrt(n);
	        System.out.println("sin(n) = " + sine);
	        System.out.println("cos(n) = " + cosine);
	        System.out.println("Square root of n = " + squareRoot);
	    } 
	}

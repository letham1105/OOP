package lesson1;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		double r;
		final float pi=3.1415f;
		Scanner K=new Scanner (System.in);
		System.out.print(" Input radius r=");
		r=K.nextDouble();
		System.out.println("Circle area = " +r*r*pi);
		System.out.println("Circle perimeter = "+2*r*pi);
	}
}

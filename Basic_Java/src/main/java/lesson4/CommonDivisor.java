package lesson4;

import java.util.Scanner;

public class CommonDivisor {
	// ham tinh uoc so chung lon nhat
	public static int comDiv (int a, int b) {
		return (b==0)?a:comDiv (b, a%b);
	}
	

	public static void main(String[] args) {
		int a;
		int b;
		// input
		Scanner keyboard = new Scanner (System.in);
		System.out.print(" a= ");
		a = keyboard.nextInt();
		System.out.print("b= ");
		b = keyboard.nextInt();
		//goi ham va in
		System.out.println(" USCLN cua "+a+" va "+b+" la " + comDiv(a,b));
				
				


	}

}

package lesson3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int N;
		int i;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("N=");
		N= keyboard.nextInt();
		
		for (i=2; i<Math.round(Math.sqrt(N));i++)
			if (N%i==0) break; 
		if (i <= Math.round(Math.sqrt(N)))
			System.out.print("N is not a prime number");
		else System.out.print(" N is a prime number ");
		

	}

}

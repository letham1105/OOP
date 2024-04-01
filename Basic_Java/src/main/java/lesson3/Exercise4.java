package lesson3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.print("N =");
		int N= keyboard.nextInt();
		
		int sum =0;
		for (int i=1; i<=N; i+=1)
			if (i%2==0) sum+=i;
		System.out.println("Sum=" +sum);
		
	}

}

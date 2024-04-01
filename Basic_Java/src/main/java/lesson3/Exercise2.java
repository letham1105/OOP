package lesson3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		float a,b,c,x1,x2,del;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("a=");
		a=keyboard.nextFloat();
		
		System.out.print("b=");
		b=keyboard.nextFloat();
		
		System.out.print("c=");
		c=keyboard.nextFloat();
		 
		del = b*b -4*a*c;
		if (del <0) System.out.println("Roots are complex and different");
		else
			if (del==0)
			{
				x1=x2=-b/(2*a);
				System.out.println("Roots are real and same: " +x1);
			}
			else 
			{
				x1=(float)(-b+Math.sqrt(del))/(2*a);
		       x2=(float)(-b-Math.sqrt(del))/(2*a);
		      
		        System.out.println(" Roots are real and different: \n x1="+x1+"\n x2="+x2);
	       }
	   }
	
}

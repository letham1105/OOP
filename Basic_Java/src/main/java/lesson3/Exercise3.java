package lesson3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		float a,b,c;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.print("a=");
	a=keyboard.nextFloat();
	
	System.out.print("b=");
	b=keyboard.nextFloat();
	
	System.out.print(" c=");
	c=keyboard.nextFloat();
	
	if ((a+b>c)&& (a+b>b)&&(b+c>a)&&(a>0)&&(b>0)&&(c>0))
	{
		System.out.print(" a,b,c are valid \n");
		if((a==b)&&(b==c)) System.out.println(" Equitaleral triangle");
		else 
			if (((a*a+b*b==c*c)&&(a==b)) || ((a*a+c*c==b*b) && (a==c)) 
					|| ((c*c+b*b==a*a) && (c==b)))
 					System.out.println("Isosceles right triagle");
			else
				if ((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b))
					System.out.println("Right triangle");
				else 
					System.out.println("Triangle");
	}
	else 
		System.out.println("\" a, b, c are not valid\"");
	}

}

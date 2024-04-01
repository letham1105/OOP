package lesson2;
public class Exercise1 {
	public static void main (String[] args) {
		int a=10, b= 20, c=30;
		int max;
		
	max = Math.max(a,b);
	System.out.println( "Max of a,b is " + max);
	 
    max = Math.max(c,max);
    System.out.println("Max of a,b,c is "+ max);
  
	}
}
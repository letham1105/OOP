package lesson3;

public class Doityourself10 {

	public static void main(String[] args) {
	// tạo biến 
	int sum=0;
		for(int i=1; i<=100; i ++ ) {
		if( i % 7 ==0) {
			sum+=i;
		
		    }	
		}
		System.out.println(" The sum of numbers divisible by 7 is less than 100:"+ sum);
	}

}

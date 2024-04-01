package lesson4;

public class FactorialCaculator {
            public static long fact (int n) {
            	// tinh n giai thua
        		long result =1;
        		for (int i=1; i <=n; i++)
        			result*=i;
        		return result;
            }
	public static void main(String[] args) {
		int maxNumber =10;
		long[] factorials = new long [maxNumber];
		// tinh va luu tru giai thua
		for (int i=1; i<= maxNumber; i++) {
		     factorials[i-1] = fact(i);
		     
				}
		// IN GIAI THUA
		for (int i=10-1; i>=0; i--) {
			System.out.println("Factorial of " + (i + 1) + " is: " + factorials[i]);
		}	
	}
}

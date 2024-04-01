package lesson4;

public class DigitSumCalculator {
	private int number;
	public DigitSumCalculator(int number) {
		this.number = number;
	}
	public int calculateDigitSum() {
		int sum =0;
		int tempNumber = number;
		
		while (tempNumber !=0) {
			int digit = tempNumber % 10;
			sum +=digit;
			tempNumber /=10;
		}
		return sum;	
	}
	public static void main(String[] args) {
   int number = 12345;
   
   DigitSumCalculator  calculator = new DigitSumCalculator (number);
   int digitSum = calculator.calculateDigitSum();
   System.out.println(" The sum of digits in " + number + " is: " + digitSum );

	}

}

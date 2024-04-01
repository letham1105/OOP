package lesson5;
class MyMath{
    public static long factorials (int num){
        long result =1;
        for (int i=2; i<=num; i++){
            result*=i;
        }
        return result;
    }
    public static boolean isPrime(long number){
        long numberSqrt = (long)Math.sqrt(number);
        boolean result = true;
        for( int i=2; i<numberSqrt && result; i++){
            if (number % i ==0)
                result = false;
        }
        return result;
    }
    public static boolean isTriangle (double num1, double num2 , double num3){
        return (num1 > (num2 + num3) && num2 > (num1 + num3) && num3 > (num2+num1));
    }
}
public class MyUtilTest {
    public static void main(String[] args) {
        double a =12, b=2, c=8;
        System.out.println("Saying that 12,2 and 8 create a triangle is:" + MyMath.isTriangle(12,2,8));
        System.out.println(" The factorials of 6 is: " +MyMath.factorials(6));
        System.out.println(" Saying that 17 is a prime number is: " +MyMath.isPrime(17));
    }
}

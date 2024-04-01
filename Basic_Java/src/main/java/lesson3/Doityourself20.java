package lesson3;

public class Doityourself20 {

    public static void main(String[] args) {
        long number = 6;
        long result = factorial(number);
        System.out.println("The factorial of 6 is: " + result);
    }

    private static long factorial(long value) {
        long result = 1;

        // Multiply numbers from 1 to value
        for (long i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }
}


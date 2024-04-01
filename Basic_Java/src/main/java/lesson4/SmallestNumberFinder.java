package lesson4;

import java.util.Scanner;

public class SmallestNumberFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number among the three
        int smallestNumber = findSmallestNumber(num1, num2, num3);

        // Display the smallest number
        System.out.println("The smallest number is: " + smallestNumber);
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        // Assume the first number is the smallest
        int smallest = num1;

        // Compare with the second number
        if (num2 < smallest) {
            smallest = num2;
        }

        // Compare with the third number
        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }
}

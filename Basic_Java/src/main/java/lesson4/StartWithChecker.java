package lesson4;

import java.util.Scanner;

public class StartWithChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the specified word
        System.out.print("Enter the specified word: ");
        String specifiedWord = scanner.nextLine();

        // Check if the input string starts with the specified word
        boolean startsWithSpecifiedWord = checkStartsWith(inputString, specifiedWord);

        // Display the result
        if (startsWithSpecifiedWord) {
            System.out.println("The string starts with the specified word.");
        } else {
            System.out.println("The string does not start with the specified word.");
        }
    }

    public static boolean checkStartsWith(String inputString, String specifiedWord) {
        // Convert both strings to lowercase for case-insensitive comparison
        String lowerCaseInput = inputString.toLowerCase();
        String lowerCaseSpecifiedWord = specifiedWord.toLowerCase();

        // Check if the input string starts with the specified word
        return lowerCaseInput.startsWith(lowerCaseSpecifiedWord);
    }
}

package lesson1;
import java.util.Scanner;

public class Exercise7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        int numberOfCharacters = inputString.length();
	        System.out.println("Number of characters in the string: " + numberOfCharacters);
	    }
	}

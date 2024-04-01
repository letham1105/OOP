package lesson4;

public class SubstringcheckExample {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String substringToCheck = "world";

        // Check if the originalString contains the substringToCheck
        boolean containsSubstring = originalString.contains(substringToCheck);

        if (containsSubstring) {
            System.out.println("The string contains the specified substring.");
        } else {
            System.out.println("The string does not contain the specified substring.");
        }
    }
}

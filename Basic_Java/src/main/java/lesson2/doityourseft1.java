package lesson2;

public class doityourseft1 {
 public static void main (String args []) {
 char ch='A';
	System.out.println("Is digit:" + Character.isDigit(ch));
	System.out.println("Is letter:" + Character.isLetter(ch));
	System.out.println("Is lowercase:" + Character.isLowerCase(ch));
	System.out.println("To uppercase: " + Character.toLowerCase (ch));
	System.out.println("Is uppercase: " + Character.isUpperCase(ch));
	System.out.println("To lowercase:" + Character.toLowerCase(ch));
	System.out.println("Is whitespace:" + Character.isWhitespace(ch));
	
	System.out.println("Numeric value:" + Character.digit(ch,10));
	char ch2 ='B';
	System.out.println("Comparison result:" + Character.compare(ch, ch2));
	System.out.println("Character to string:" + Character.toString(ch));
}
}
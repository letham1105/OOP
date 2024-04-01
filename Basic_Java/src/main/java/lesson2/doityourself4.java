package lesson2;
import java.util.*;
public class doityourself4 {

	public static void main(String[] args) {
		//test 5 methods in java lang
	String str = "Hello, World! ";
	int length = str.length();
	System.out.println("Length of the string: "+length);
	
	String lowerCaseStr = str.toLowerCase();
	System.out.println("Lowercase string: " + lowerCaseStr);
	
	String subStr =str.substring(5,14);
	System.out.println ("Substring: " + subStr);
	
    String replaceStr = str.replace("Hello", "Hi");	
	System.out.println("Replaced string: " + replaceStr);
	
    // test 5 methods in java util
	 
	HashMap< String, Integer > hashMap = new HashMap<>();
	hashMap.put("one", 1);
	hashMap.put("two", 2);
	System.out.println (" HashMap: " + hashMap);
	System.out.println ("value for key 'one': " + hashMap.get("one"));
     
	Date currentDate = new Date();
	System.out.println(" Current Date and Time: " + currentDate);
	
	Random random= new Random();
	int randomInt = random.nextInt(10);
	System.out.println(" Random int: " +randomInt);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string: ");
	
	String inputString = scanner.next();
	System.out.println(" you entered: " + inputString );
	}

}

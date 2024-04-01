package lesson2;

public class doityourseft2 {
public static void main (String [] args)
{
	StringBuffer buffer = new StringBuffer ("Hello");
	System.out.println("Original StringBuffer : " + buffer);
	
	buffer.append(" world");
	System.out.println("After append : " +buffer);
	
	buffer.insert(5, " Beautiful");
	System.out.println("After insert : " + buffer);
	
	buffer.delete(5,11);
	System.out.println(" After delete : " + buffer);
	
	buffer.replace(6, 11, " java ");
	System.out.println("After replace : " +buffer);
	
	buffer.reverse();
	System.out.println("After reverse : " +buffer);
	
	int length= buffer.length();
	System.out.println("Lenght of StringBuffer : " + length);
	
	int capacity = buffer.capacity();
	System.out.println("Capacity of StringBuffer : " + capacity);
	
	String substring =buffer.substring(6,11);
	System.out.println("Substring: " + substring);
	
	int index =buffer.indexOf("world");
	System.out.println(" Index of world : " +index);
	
	int lastIndex =buffer.lastIndexOf("l");
	System.out.println("Last index of 'l ' : " + lastIndex );
}
}


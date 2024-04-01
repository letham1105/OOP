package lesson4;

import java.util.Enumeration;
import java.util.Vector;

public class Reference {

	public static void main(String[] args) {
		 // vetor cuar vi tri trong ban dau 
		Vector <String > vec = new Vector < String> (6);
		// add element
		vec.addElement(" banana");
		vec.addElement(" watermelon");
		vec.addElement(" mango");
		vec.addElement(" apple");
		// check size and capacityincrement
		System.out.println(" Size is: " + vec.size());
		System.out.println(" Default capacity increment is: " + vec.capacity());
		;
		vec.addElement(" grape");
		vec.addElement(" orange");
		vec.addElement(" clipart");
		System.out.println(" Size after addition: " +vec.size());
		System.out.println(" Capacity after increment is :" + vec.capacity());
          // display vector element
		Enumeration en = vec.elements();
        System.out.println(" \nElement are: ");
        while(en.hasMoreElements())
        System.out.println(en.nextElement() +" ");
        

	}

}

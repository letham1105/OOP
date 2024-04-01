package lesson3;

public class doityourself9 {

	public static void main(String[] args) {
		int [] arr = new int[100];
		double max = Double.NEGATIVE_INFINITY;
	     for (int i=1; i< arr.length; i++) {
	    	 arr[i] =i+1;
	    	 if(arr[i]> max && arr[i]%7==0 ) {
	    		 max = arr[i]; 
	    	 }
	     }
	    	if (max != Double.NEGATIVE_INFINITY) {
	    		System.out.println("The max number divisible by 7 between 1 and 100 is: "+max);
	    	} else {
	    		System.out.println(" no number divisible by 7 found between 1 and 100");
	    	}
	     }
	     
	}



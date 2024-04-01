package lesson4;
public class Descendinginterger {
	public static void main ( String[] args) {
     int[] arr = {8,5,2,7,9,1};
     // mang giam dan
        for (int i=0; i<arr.length -1; i++)
        	for (int j=i+1; j<arr.length; j++)
        		if (arr[i]<arr[j])
        		{
        			int temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	// in ra man hinh
        for (int i=0; i< arr.length; i++)
        	System.out.println(arr[i]+" ");
     
	}

}

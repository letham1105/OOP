package lesson4;

public class ArraySort {

	public static void main(String[] args) {
		// tao va khoi tao gia tri mang
		int[] A = {5,7,2,4,8};
		// sap xep tang dan
		for (int i=0; i<A.length-1; i++)
			for (int j=i+1; j<A.length; j++)
				if (A[i] > A[j]) {
					int t =A[i];
					A[i]= A[j];
					A[j]=t;
				}
		// in mang
		for (int i=0; i<A.length;i++)
			System.out.println(A[i] +"");
	}

}
 


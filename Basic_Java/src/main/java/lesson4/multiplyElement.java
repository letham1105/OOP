package lesson4;

public class multiplyElement {

	public static void main(String[] args) {
		int[] A= {2,3,5,3};
		int[] B= {2,4,-5,-2};
		// kiem tra mang bang nhau
		if(A.length != B.length) {
			System.out.println(" Do dai 2 mang phai giong nhau");
			return;
		}
		// nhan element
		for (int i=0; i<A.length; i++){
				int result = A[i] * B[i];
				System.out.println(" Result:" +result);
			}
	}

}

package lesson4;

import java.util.Arrays;

public class SwapElement {
	public static void swapfirstAndLast(int[] arr) {
	if (arr.length <2) {
		System.out.println(" Mang khong du phan tu de thuc hien");
		return;
	}
 // hoan doi
	int temp = arr[0];
	arr[0] = arr[arr.length -1];
	arr[arr.length -1] = temp;
}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(" Mang ban dau:  " + Arrays.toString(arr));
		swapfirstAndLast(arr);
		System.out.println(" mang sau khi hoan doi: " +Arrays.toString(arr));
	}		
}

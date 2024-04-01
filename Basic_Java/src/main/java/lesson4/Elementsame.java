package lesson4;

public class Elementsame {
	private int[] arr;
	public Elementsame(int[] arr) {
		this.arr = arr;
	}
	public boolean firstAndLastIsSame() {
		if (arr.length ==0) {
			return false;
		}
		return arr[0] == arr[arr.length -1];
	}
	

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,3,1};
		int[] arr2 = {5,6,3,2,1};
		Elementsame checker1 = new Elementsame(arr1);
		Elementsame checker2 = new Elementsame( arr2);
		System.out.println(" Element first and last is Same " +checker1. firstAndLastIsSame());
		System.out.println(" Element first and last is Same " +checker2. firstAndLastIsSame() );

	}

}

package lesson4;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6};
        System.out.println(Arrays.toString(arr));
            //reverse
        for (int i=0,j=arr.length-1; i <j; i++,j--){
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
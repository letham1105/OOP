package lesson4;

import java.sql.SQLOutput;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int[] A = {6, 2, 9, 5, 3};
        for (int i = 0; i <= A.length; i++) {
             for(int j = 1+i; j<=A.length-1 ; j++) {
                 if (A[i] > A[j]){
                   int  temp =A[i];
                     A[i] =A[j];
                     A[j] = temp;
                 }
             }
        }
        System.out.println("Max of Array: " + A[A.length - 1]);
        System.out.println("Min of Array:"+ A[0]);
        }
    }










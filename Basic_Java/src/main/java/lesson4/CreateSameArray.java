package lesson4;
import java.util.Arrays;

public class CreateSameArray {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};
        // tao mang giong voi mang vua tao
        int[] newArray = Arrays.copyOf(inputArray, inputArray.length);
        System.out.println(" Original Array: " + Arrays.toString(inputArray));
        System.out.println(" New Array: " + Arrays.toString(newArray));
    }
}

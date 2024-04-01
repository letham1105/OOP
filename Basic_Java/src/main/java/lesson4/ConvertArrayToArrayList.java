package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] strings = new String[]
                {"a","a","c","d"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(arrayList);

    }
}

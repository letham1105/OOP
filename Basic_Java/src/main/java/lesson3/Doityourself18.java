package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Doityourself18 {

    public static void main(String[] args) {
        int numTerms = 6;  // Number of terms in the series

        // Generate the series and print it
        List<Integer> series = generateSeries(numTerms);
        for (int i : series) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> generateSeries(int n) {
        List<Integer> series = new ArrayList<>();
        int term = 1;

        for (int i = 0; i < n; i++) {
            series.add(term);
            term = term * 2 + i;  // Update the term based on the correct formula
        }

        return series;
    }
}

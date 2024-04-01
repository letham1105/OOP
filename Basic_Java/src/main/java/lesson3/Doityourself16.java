package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Doityourself16 {
    public static List<Integer> generateSeries(int n) {
        List<Integer> series = new ArrayList<>();
        series.add(0);

        int increment = 3;

        // Generate the series based on the pattern
        for (int i = 1; i < n; i++) {
            series.add(series.get(i - 1) + increment);
            increment += 2;  // Increment increases by 2 for each step
        }

        return series;
    }

    public static void main(String[] args) {
        int numTerms = 9;  // Change this to generate a longer series

        // Generate the series and print it
        List<Integer> series = generateSeries(numTerms);
        for (int i : series) {
            System.out.print(i + " ");
        }
    }
}

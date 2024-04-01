package lesson3;

public class Doityourself21 {

    public static void main(String[] args) {
        for (int i = 0; i <= 0xFFFF; i++) {
            // Print the hexadecimal representation of the number
            System.out.println(Integer.toHexString(i).toUpperCase());
        }
    }
}

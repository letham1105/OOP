package lesson4;

public class SubString {
    public static void main(String[] args) {
        String originalString = " The quick brown for jumps over the lazy dog";
        int startIndex =10;
        int endIndex =20;
        String subtracting =originalString.substring(startIndex,endIndex);
        System.out.println("Substring:" +subtracting);
    }
}

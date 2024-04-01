package lesson4;

public class VowelCounter {
    private String inputString;

    public VowelCounter(String inputString) {
        this.inputString = inputString;
    }

    public int countVowels() {
        int vowelCount = 0;
        // Chuyển về chữ thường
        String lowerCaseInput = inputString.toLowerCase();
        // Lặp mỗi kí tự và đếm
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char currentChar = lowerCaseInput.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        String inputString = "this is a sample string";
        VowelCounter counter = new VowelCounter(inputString);
        int vowelCount = counter.countVowels();
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}

package lesson4;

public class countword {
	public static int countword(String inputString) {
		inputString = inputString.trim();
		// dung split tach chuoi
		// tach theo khoang trang
		String[] words = inputString.split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {
		String inputString = " This is a sample string ";
		int countword = countword(inputString);
		System.out.println("number of word in the string: " + countword);
	}

}

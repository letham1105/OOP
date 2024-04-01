package lesson4;

public class StringProcessing {

	public static void main(String[] args) {
		String s= " Write a Java program very easily";
		// chua so luong ky tu a trong chuoi
		int count=0;
		// dem a
		for (int i=0; i<s.length(); i++)
			if (s.charAt(i) == 'a') count++;
		System.out.println(" so luong ky tu a co trong chuoi =" + count);
		// kiem tra chuoi co chua java hay khong
		int index = s.indexOf("java");
		if (index>= 0) System.out.println(" Tu java dau tien cua chuoi o vi tri " + index);
		else System.out.println(" chuoi khong chua tu java");
		// kiem tra chuoi bat dau bang tu write 
		if (s.startsWith(" Write") == true) System.out.println(" tu Write bat dau chuoi");
		else System.out.println(" Tu write khong bat dau chuoi");
		// kiem tra chuoi ket thuc bang easily
		if (s.endsWith(" easily") == true) System.out.println(" tu easily ket thuc chuoi");
		else System.out.println(" tu easily khong ket thuc chuoi ");

	}

}

package lesson3;

public class Doityourself14 {

	public static void main(String[] args) {
		int chieuCao = 4;
		int soSao = 1;
	 for (int i = 1; i <= chieuCao; i++ ) {
		 // in khoang trang
		 for (int j= chieuCao; j>i; j--) {
			 System.out.print("  ");
		 }
			 // in*
			 for (int k=1; k <= soSao; k++) {
				 System.out.print(" * ");
			 }
			 soSao+=2;
				System.out.println(); 
				
		    }	
	    }
	}



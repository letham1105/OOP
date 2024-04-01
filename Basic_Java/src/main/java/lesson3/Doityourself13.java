package lesson3;

public class Doityourself13 {

    public static void main(String[] args) {
    	// tamgiacnguoc
        int chieuCao = 4;  // Số hàng của tam giác
        int soSao= 10;
        // Vòng lặp duyệt qua số hàng của tam giác
        for (int i = 1; i <= chieuCao; i++) {

            // In khoảng trắng
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
        
            // In dấu '*'
            for (int k = 1; k <= soSao; k++) {
                System.out.print(" * ");
            }
            soSao-=2;
            
            // Xuống dòng
            System.out.println();
        }
        // tamgiacthuan
        soSao = 6;
        int chieuCao1=3;
        for (int i = 1; i<=chieuCao1; i++) {
        	// In khoang trang
        	for (int j= chieuCao1; j>i; j--) {
        		System.out.print("  ");
        	}
        	// in *
        	for (int k =1; k<=soSao; k++) {
        		System.out.print(" * ");
        	}
        	soSao+=2;
        	// xuongdong
        	System.out.println();
        }
        
    }
}


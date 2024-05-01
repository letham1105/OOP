package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("Nhap vao 2 so thuc: ");
            float a = keyboard.nextFloat();
            float b = keyboard.nextFloat();
            float result = a/b;
            System.out.println(" Ket Qua "+result);
        }catch (InputMismatchException exception ){
            System.out.println(" Loi Nhap So Thuc:");
        }catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/by zero")) {
                System.out.println(" Loi chia so 0 ");
            } else {
                throw exception;
            }
        } finally{
            keyboard.close();
        }
    }
}

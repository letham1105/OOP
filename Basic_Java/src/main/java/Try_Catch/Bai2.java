package Try_Catch;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    public static void main(String[] args) throws InterruptedException {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu n mang ");
        n = input.nextInt();
        int[] mang = new int[n];
        nhap(mang, n);
    }
    public static <MyException extends Throwable>
    void nhap(int[] mang, int n) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int i = 0;
        try {
            System.out.println("Bạn không được phép nhập 100 vì sẽ làm chương trình tự in ra những gì bạn nhập");
            for (; i < n; i++) {
                System.out.format("Nhap vao phan tu thu %d:", i + 1);
                mang[i] = Integer.parseInt(input.nextLine());
                if (mang[i] == 100) {
                    System.err.println("Bạn đã nhập 100 !!!!!");
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            e.wait();
        }
    }
}
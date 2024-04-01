package lesson1;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner K= new Scanner(System.in);
        System.out.print("Input two int numbers : ");
        int a= K.nextInt();
        int b= K.nextInt();
        System.out.println(a+" + "+b+" ="+(a+b)); 
        System.out.println(a+" - "+b+" ="+(a-b)); 
        System.out.println(a+" * "+b+" ="+(a*b)); 
        System.out.println(a+" / "+b+" ="+(a/b)); 
        System.out.println(a+" mod "+b+" ="+(a%b)); 
    }
}
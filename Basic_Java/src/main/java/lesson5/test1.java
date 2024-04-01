package lesson5;

public class test1 {
    public static int switchIt(int x)
    {
        int j = 1;
        switch (x) {
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            default:
                j++;
        }
        return j + x;
    }
    public static void main(String[] args) {
        System.out.println("value = " + switchIt(4));
    }

}

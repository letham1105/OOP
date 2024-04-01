package lesson4;

public class FindCommonElement {
    public static void main(String[] args) {
        String[] arr1 = {"Python", "java", "C++", " c#","PHP", "SQl"};
        String[] arr2 = {"Python", "java", "Oracle","DB2"};
        for (int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                if (arr1[i].equals(arr2[j])){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

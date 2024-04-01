package lesson4;

public class Matrix {
    public static int[][] generateMatrix(){
        int[][] matrix = new int [8][8];
        int value =1;
        for (int i =0; i< 8; i++){
            for (int j=0; j<8; j++){
                matrix[i][j] = value;
                value++;
            }
        }
        return matrix;
    }
    public static void displayMatrix (int[][] matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         int[][] matrix = generateMatrix();
         //Display
        displayMatrix(matrix);
    }
}

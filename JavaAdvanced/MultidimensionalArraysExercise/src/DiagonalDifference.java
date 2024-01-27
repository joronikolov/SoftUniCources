import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputParams = Integer.parseInt(scan.nextLine());
        int[][] matrix=methodA(inputParams, scan);
        int diag1=0;
        int diag2=0;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix.length; j++){
                if(j==i ){
                    diag1+=matrix[i][j];
//                    System.out.printf("diag1: %d%n", matrix[i][j]);

                }
                if(j+i==matrix.length-1){
                    diag2+=matrix[i][j];
//                    System.out.printf("diag2: %d%n", matrix[i][j]);
                }
            }
        }
//        System.out.println(diag1);
//        System.out.println(diag2);
        System.out.println(Math.abs(diag2-diag1));

    }
    private static int[][] methodA( int dimension, Scanner scan){
        int[][] matrix = new int[dimension][dimension];
        for(int i = 0; i < dimension; i++){
            matrix[i]= Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
    private static void print(int[][] input){
        for(int[] row: input){
            for(int i : row){
                System.out.printf("%d ", i);
            }
            System.out.println();
        };
    }


}

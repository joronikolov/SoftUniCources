import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputParams = scan.nextLine().split(", ");
        if("A".equals(inputParams[1])) {
            print(methodA(Integer.parseInt(inputParams[0])));
        }else{
            print(methodB(Integer.parseInt(inputParams[0])));
        }

    }
    private static int[][] methodA( int dimension){
        int v =1;
        int[][] matrix = new int[dimension][dimension];
        for(int i = 0; i < dimension; i++){
            for(int j= 1; j<=dimension; j++){
                matrix[j-1][i]=v;
                v++;
            }
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
    private static int[][] methodB( int dimension) {
        int v = 1;
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            if (i == 0 | i % 2 == 0) {
                for (int j = 1; j <= dimension; j++) {
                    matrix[j - 1][i] = v;
                    v++;
                }
            } else {
                for (int j = dimension - 1; j >= 0; j--) {
                    matrix[j][i] = v;
                    v++;
                }
            }

        }
        return matrix;
    }
}

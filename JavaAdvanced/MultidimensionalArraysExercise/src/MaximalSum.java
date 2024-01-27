import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputParams = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int n = inputParams[0];
        int m = inputParams[1];
        int[][] maxMatrix= new int[3][3];
        int[][] curMatrix= new int[3][3];
        int max=0;
        int sum=0;
       int[][]     matrix=methodA(n, m, scan);
       for (int i =0; i<n; i++){
           for (int g=0; g<m; g++) {
               sum=0;
               if ( i + 2 < n & g+2<m ) {
                   int v = i;
                   int h = g;

                   for (int z = v; z < v + 3; z++) {
                       for (int j = h; j < h + 3; j++) {
                           sum+=matrix[z][j];
                           curMatrix[z-v][j-h]=matrix[z][j];
//                           System.out.printf("%d ", matrix[z][j]);
                       }
//                       System.out.println();
                   }
                   if (sum>max){
                       max=sum;
                       for (int f =0; f<maxMatrix.length; f++){
                           for (int t =0; t<maxMatrix.length; t++){
                               maxMatrix[f][t]=curMatrix[f][t];
                           }
                       }
//                       maxMatrix=curMatrix;
                   }
//                   System.out.println("-----------------------");

               }

           }

       }
        System.out.printf("Sum = %d%n", max);
       print(maxMatrix);



    }
    private static int[][] methodA( int r, int c, Scanner scan){
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++){
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
    private static void print(int[][] input){
        for(int[] row: input){
            for(int i : row){
                System.out.printf("%s ", i);
            }
            System.out.println();
        };
    }

}

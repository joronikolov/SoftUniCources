import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputParams = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

            print(methodA(inputParams[0], inputParams[1]));


    }
    private static String[][] methodA( int r, int c){
        char v =97;
        String[][] matrix = new String[r][c];
        for(int i = 0; i < r; i++){
            for(int j= 0; j<c; j++){
                StringBuilder sb = new StringBuilder();
                sb.append((char)(v + i)) ;
                sb.append((char)(v + j+i));
                sb.append((char)(v + i));

                matrix[i][j]= sb.toString();
            }
        }
        return matrix;
    }
    private static void print(String[][] input){
        for(String[] row: input){
            for(String i : row){
                System.out.printf("%s ", i);
            }
            System.out.println();
        };
    }

}

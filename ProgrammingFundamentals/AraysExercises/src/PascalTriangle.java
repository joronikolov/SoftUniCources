import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] lastArray = new int[n];
        lastArray[0]=1;
        for(int i = 0 ; i<n; i++){
            int[] internal = new int[i + 1];
            internal[0]=1;
            for(int j = 0; j <internal.length ; j++) {


                internal[j] = (j == 0 ? 1 : lastArray[j-1] + lastArray[j]);
                internal[0]=1;
            }
            System.arraycopy(internal, 0, lastArray, 0, internal.length);

            for (int e : internal){
                System.out.printf("%d ", e);
            }
            System.out.println();

        }
    }
}

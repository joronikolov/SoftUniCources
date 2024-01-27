import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CrossFire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputParams = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int n = inputParams[0];
        int m = inputParams[1];
        Integer[][] matrix = new Integer[n][m];
        int counter=1;
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[n][m]=counter;
                counter++;
            }
        }
        //int[] command = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        String command = scan.nextLine();
        while(!"Nuke it from orbit".equals(command)) {
            int[] coordinates = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
            int row = coordinates[0];
            int column = coordinates[1];
            int radius = coordinates[2];
            List<List<Integer>> newLength = new LinkedList<>();

            for(int i=0; i< n;i++){
                List<Integer> elements = new LinkedList<>();
                if(i>=row-radius &&  i<=row+radius){
                    if(i==row){
                        if

                    }else{
                        size-=1;
                    }
                }
`               newLength.add(size);
            }
            command = scan.nextLine();
        }
    }

}

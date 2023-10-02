
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());
        int[] tempArray=curArray;
        for(int i=0; i<n; i++){
            int firstElement=tempArray[0];
            for(int j=0;j<tempArray.length-1;j++){
                tempArray[j]=tempArray[j+1];
            }
            tempArray[tempArray.length-1]=firstElement;


        }
for(int e : tempArray){
    System.out.printf("%d ",e);
}
    }
}

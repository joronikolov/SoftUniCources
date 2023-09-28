
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length=intArr.length;
        for(int i=0;i<length-1;i++){

            int[] tempArr = new int[intArr.length-1];
            for(int j=0;j<tempArr.length;j++){
                tempArr[j]=intArr[j]+intArr[j+1];


            }
            intArr=tempArr;
        }
        System.out.println(intArr[0]);
    }
}

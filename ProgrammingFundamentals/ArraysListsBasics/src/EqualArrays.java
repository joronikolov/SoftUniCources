
import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
boolean equal=true;
int sum=0;
        for (int i= 0;i<firstArr.length;i++){
            sum+=firstArr[i];
           if(firstArr[i]!=secondArr[i]){
               System.out.printf("Arrays are not identical. Found difference at %d index.", i);
               equal=false;
break;
           }
        }
        if(equal==true){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }


    }
}

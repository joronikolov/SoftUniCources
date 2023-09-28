import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int element : intArr){
            if(element%2==0){
                sum+=element;
            }
        }
        System.out.println(sum);

    }
}

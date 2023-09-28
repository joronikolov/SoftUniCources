
import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
int sumEven=0;
int sumOdd=0;
        for (int i= 0;i<=intArr.length-1;i++){
           if(intArr[i]%2==0){
               sumEven+=intArr[i];
           }else {
               sumOdd+=intArr[i];
           }
        }
        System.out.println(sumEven-sumOdd);

    }
}

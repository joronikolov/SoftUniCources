
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");

        for (int i= 0;i<strArr.length/2;i++){
            String container=strArr[strArr.length-1-i];
            strArr[strArr.length-1-i]=strArr[i];
            strArr[i]=container;
        }
        System.out.println(String.join(" ",strArr));

    }
}

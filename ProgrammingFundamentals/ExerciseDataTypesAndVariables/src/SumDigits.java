import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne=Integer.parseInt(scan.nextLine());
        int process=numberOne;
        int result =0;
        while(process>0){
            result+=process%10;
            process/=10;
        }
        System.out.println(result);

    }
}

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        scan.nextLine();
        int sum=0;
        while (true){
            sum+= scan.nextInt();
            scan.nextLine();
            if(sum>=target){
                System.out.println(sum);
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 1;
        while(sum<=n){
            System.out.println(sum);
            sum=sum*2+1;
        }

    }
}

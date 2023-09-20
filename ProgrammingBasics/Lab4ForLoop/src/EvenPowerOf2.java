import java.util.Scanner;

public class EvenPowerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int end = scan.nextInt();
        for(int i=0; i<=end;i++){
            if(i%2==0) {
                System.out.printf("%.0f%n",Math.pow(2,i));
            }
        }
    }
}

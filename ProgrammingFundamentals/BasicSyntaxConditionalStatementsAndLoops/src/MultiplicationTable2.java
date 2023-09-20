import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int start=Integer.parseInt(scan.nextLine());
        if(start<10) {
            for (int i = start; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }else{
            System.out.printf("%d X %d = %d%n", n, start, n * start);
        }
    }
}
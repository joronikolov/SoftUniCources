import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pounds=Double.parseDouble(scan.nextLine());
        System.out.printf("%.3f",pounds*1.36);

    }
}

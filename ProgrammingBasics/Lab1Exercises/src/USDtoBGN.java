import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double coefficient = 1.79549;
        double amount = Double.parseDouble(scan.nextLine());
        System.out.println(coefficient*amount);
    }


}

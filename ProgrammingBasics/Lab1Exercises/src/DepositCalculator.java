import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //double coefficient = 180/Math.PI;
        double depositAmount = Double.parseDouble(scan.nextLine());
        int period = scan.nextInt();
        double interest=scan.nextDouble();
        System.out.println(depositAmount+period*((depositAmount*interest/100)/12));
    }


}

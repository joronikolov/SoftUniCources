import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        double dollarLevRatio = 1.57;
        Scanner scan = new Scanner(System.in);
        double processorPrice=scan.nextDouble();
        scan.nextLine();
        double videoCardPrice=scan.nextDouble();
        scan.nextLine();
        double ramPrice=scan.nextDouble();
        scan.nextLine();
        int ramCount=scan.nextInt();
        scan.nextLine();
        double discountPercent=scan.nextDouble();
        scan.nextLine();
        System.out.printf("Money needed - %.2f leva.", ((processorPrice+videoCardPrice)-(processorPrice+videoCardPrice)*discountPercent+ramPrice*ramCount)*1.57);
    }
}

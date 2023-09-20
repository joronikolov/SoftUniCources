import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double pricePerSqMeter=7.61;
        final double discountPercent = 18;
        double sqMeters=scan.nextDouble();
        System.out.printf("The final price is: %.2f lv.%n", (sqMeters*pricePerSqMeter)-((sqMeters*pricePerSqMeter)*discountPercent/100));
        System.out.printf("The discount is: %.2f lv.%n", ((sqMeters*pricePerSqMeter)*discountPercent/100));
    }
}

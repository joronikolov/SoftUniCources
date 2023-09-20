import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double packageOfPensPrice = 5.8;
        double packageOfHighlitersPrice = 7.2;
        double solutionPrice = 1.2;


        int penPackagesNumber = Integer.parseInt(scan.nextLine());
        int highlighterNumber = scan.nextInt();
        int solutionLiters =scan.nextInt();
        int discountPercent =scan.nextInt();

        double priceWithoutDiscount=penPackagesNumber*packageOfPensPrice+highlighterNumber*packageOfHighlitersPrice+solutionLiters*solutionPrice;
        double discountedPrice=priceWithoutDiscount-( ((double)discountPercent/100*priceWithoutDiscount));
        System.out.println(discountedPrice);
    }

}

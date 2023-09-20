import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double dogFoodPrice=2.5;
        final double catFoodPrice =4;
        System.out.println(( scan.nextInt()*dogFoodPrice+ scan.nextInt()*catFoodPrice)+" lv.");
    }
}

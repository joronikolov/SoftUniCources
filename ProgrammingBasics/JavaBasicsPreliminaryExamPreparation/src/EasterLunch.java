import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        double cakesPrice = 3.2;
        double eggsPrice = 4.35;
        double cookiesPrice = 5.4;
        double eggPintPrice = 0.15;
        Scanner scan = new Scanner(System.in);
        int cakes = scan.nextInt();
        scan.nextLine();
        int eggs = scan.nextInt();
        scan.nextLine();
        int cookies = scan.nextInt();
        scan.nextLine();
        System.out.printf("%.2f", cakes*cakesPrice+eggs*eggsPrice+cookies*cookiesPrice+eggs*12*eggPintPrice);


    }
}


import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        double puzzlePrice = 2.6;
        double dollPrice=3d;
        double teddyPrice=4.1;
        double minionPrice=8.2;
        double truckPrice=2d;
        Scanner scan = new Scanner(System.in);
        double tripPrice=scan.nextDouble();
        int puzzles=scan.nextInt();
        int dolls=scan.nextInt();
        int teddys=scan.nextInt();
        int minions=scan.nextInt();
        int trucks=scan.nextInt();
        double totalPrice = puzzles*puzzlePrice+dolls*dollPrice+teddys*teddyPrice+minions*minionPrice+trucks*truckPrice;
        if (puzzles+dolls+teddys+minions+trucks>=50){
            totalPrice-=totalPrice*25/100;
        }
        totalPrice-=totalPrice*10/100;
        if(totalPrice-tripPrice>=0){
            System.out.printf("Yes! %.2f lv left.",totalPrice-tripPrice );
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(totalPrice-tripPrice));
        }
    }
}

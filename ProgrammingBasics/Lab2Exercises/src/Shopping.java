import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double budget = scan.nextDouble();
        int videoCards = scan.nextInt();
        int processors = scan.nextInt();
        int ram = scan.nextInt();
        double videoCardPrice = 250;
        double processorPrice=((videoCardPrice*videoCards)*35/100);
        double ramPrice=((videoCardPrice*videoCards)*10/100);
        double totalPrice=videoCards*videoCardPrice+processors*processorPrice+ram*ramPrice;
        if(videoCards>processors){
            totalPrice-=totalPrice*15/100;
        }
        if(budget-totalPrice>=0){
            System.out.printf("You have %.2f leva left!", budget-totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(budget-totalPrice) );
        }

    }
}

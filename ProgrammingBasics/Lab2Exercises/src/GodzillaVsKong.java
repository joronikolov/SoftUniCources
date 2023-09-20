import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = scan.nextDouble();
        int statists= scan.nextInt();
        double costumePrice= scan.nextDouble();
        double decorPrice=budget*10/100;
        if(statists>=150){
            costumePrice-=costumePrice*10/100;
        }
        if((costumePrice*statists)+decorPrice>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget-(costumePrice*statists)-decorPrice));
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget-(costumePrice*statists)-decorPrice));
        }
    }
}

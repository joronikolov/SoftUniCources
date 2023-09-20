import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyNeeded = scan.nextDouble();
        scan.nextLine();
        double cash=scan.nextDouble();
        scan.nextLine();
        int onlySpendingDays=0;
        int daysPassed=0;
        while (true){
            String action= scan.nextLine();
            double currentSum=scan.nextDouble();
            scan.nextLine();
            if(action.equals("spend")){
                if(cash-currentSum<0){
                    cash=0;

                }else {
                    cash-=currentSum;
                }
                onlySpendingDays++;
                daysPassed++;
                if(onlySpendingDays>=5){
                    System.out.printf("You can't save the money.%n%d",daysPassed);
                    break;
                }
            } else if (action.equals("save")) {
                cash+=currentSum;
                onlySpendingDays=0;
                daysPassed++;
                if(cash>=moneyNeeded){
                    System.out.printf("You saved the money for %d days.",daysPassed);
                    break;
                }
                
            }
        }
    }
}

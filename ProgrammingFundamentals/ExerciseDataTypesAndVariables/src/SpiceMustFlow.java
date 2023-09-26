import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingYield=Integer.parseInt(scan.nextLine());
        int currentYield = startingYield;
        int daysPassed=0;
        int totalAmount=0;
        while(currentYield>=100){
            daysPassed++;
            totalAmount+=currentYield;
            currentYield-=10;
            if(totalAmount>=26) {
                totalAmount -= 26;
            }

        }
        if(totalAmount>=26) {
            totalAmount -= 26;
        }
        System.out.println(daysPassed);
        System.out.println(totalAmount);

    }
}

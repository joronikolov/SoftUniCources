import java.util.Scanner;

public class ChristmasTournament {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numberOfDays= scan.nextInt();
        scan.nextLine();
        double totalSum=0;
        int wonDays=0;
        int loseDays=0;
        for(int i=1; i<=numberOfDays;i++){
            int wins=0;
            int loses=0;
            double dailySum=0;
            String command=scan.nextLine();
            while(!command.equals("Finish")){
                switch(scan.nextLine()){
                    case "win":
                        wins++;
                        dailySum+=20;
                        break;
                    case "lose":
                        loses++;
                        break;
                }
                command=scan.nextLine();
            }
            if(wins>loses){
                dailySum+=dailySum*10.0/100;
                wonDays++;
            }else {
                loseDays++;
            }
            totalSum+=dailySum;
        }
        if(wonDays>loseDays){
            totalSum+=totalSum*20*1.0/100;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalSum);
        }else{
            System.out.printf("You lost the tournament! Total raised money: %.2f",totalSum);
        }
    }
}

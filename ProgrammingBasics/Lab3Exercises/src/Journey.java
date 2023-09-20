import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = scan.nextDouble();
        scan.nextLine();
        String season=scan.nextLine();
        String dest="";
        String dest1="";
        double totalSum=0;

        if(budget<=100){
            dest1="Bulgaria";
            if(season.equals("summer")){
                dest="Camp";
                totalSum=budget*30d/100;
                
            }else {
                dest="Hotel";
                totalSum=budget*70d/100;
            }
        } else if (budget>100&&budget<=1000) {
            dest1="Balkans";
            if(season.equals("summer")){
                dest="Camp";
                totalSum=budget*40d/100;

            }else {
                dest="Hotel";
                totalSum=budget*80d/100;
            }
            
        }else if(budget>1000){
            dest1="Europe";
            dest="Hotel";
            totalSum=budget*90d/100;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f",dest1, dest,totalSum);
    }
}

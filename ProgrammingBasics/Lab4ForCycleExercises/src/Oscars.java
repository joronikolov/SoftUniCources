import java.util.Map;
import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String actorName= scan.nextLine();
        double points = scan.nextDouble();
        scan.nextLine();
        int assessors = scan.nextInt();
        scan.nextLine();
        for (int i=0; i<assessors;i++){
            String assessorName = scan.nextLine();
            double assessorScore = scan.nextDouble();
            scan.nextLine();
            points+=(double) assessorName.length()*assessorScore/2;
            if(points>1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName,points);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!",actorName, Math.abs(1250.5-points));

    }
}

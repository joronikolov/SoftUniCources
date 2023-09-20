import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournaments=scan.nextInt();
        scan.nextLine();
        int startingPoints=scan.nextInt();

        scan.nextLine();
        int currentPoints=startingPoints;
        int wonTournaments=0;
        for (int i=0;i<tournaments;i++){
            String phase = scan.nextLine();
            switch (phase){
                case "W":
                    currentPoints+=2000;
                    wonTournaments++;
                    break;
                case "F":
                    currentPoints+=1200;
                    break;
                case "SF":
                    currentPoints+=720;
                    break;
                default:currentPoints+=0;
                break;
            }
        }
        System.out.printf("Final points: %d%n", currentPoints);
        System.out.printf("Average points: %d%n", (currentPoints-startingPoints)/tournaments);
        System.out.printf("%.2f%%%n", wonTournaments*1.0/tournaments*100);
    }
}

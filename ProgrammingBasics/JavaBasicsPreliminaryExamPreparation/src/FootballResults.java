import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wins=0;
        int looses =0;
        int draws = 0;
        for(int i=1; i<=3; i++){
            String currentResult=scan.nextLine();
            String[] curResArray=currentResult.split(":");
            int firstTeam=Integer.parseInt(curResArray[0]);
            int secondtTeam=Integer.parseInt(curResArray[1]);
            if(firstTeam>secondtTeam){
                wins++;
            } else if (firstTeam<secondtTeam) {
                looses++;
            }else if(firstTeam==secondtTeam){
                draws++;
            }
        }
        System.out.printf("Team won %d games.%n",wins);
        System.out.printf("Team lost %d games.%n",looses);
        System.out.printf("Drawn games: %d%n",draws);
    }
}

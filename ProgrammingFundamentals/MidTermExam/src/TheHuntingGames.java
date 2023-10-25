import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysOfAdventure = Integer.parseInt(scan.nextLine());
        int numberOfPlayers = Integer.parseInt(scan.nextLine());
        double groupEnergy = Double.parseDouble(scan.nextLine());
        double waterForOnePerson = Double.parseDouble(scan.nextLine());
        double foodForOnePerson = Double.parseDouble(scan.nextLine());
        double waterForGroup=waterForOnePerson*daysOfAdventure*numberOfPlayers;
        double foodForGroup=foodForOnePerson*daysOfAdventure*numberOfPlayers;
        for(int i=1; i<=daysOfAdventure; i++){
            double lostEnergy = Double.parseDouble(scan.nextLine());
            groupEnergy-=lostEnergy;
            if(groupEnergy<=0){
                break;
            }
            if(i%2==0){
                groupEnergy+=groupEnergy*5/100;
                waterForGroup-=waterForGroup*30/100;
            }
            if(i%3==0){
                foodForGroup-=foodForGroup/numberOfPlayers;
                groupEnergy+=groupEnergy*10/100;
            }

        }
        if(groupEnergy>0){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",
                    groupEnergy);
        }else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", foodForGroup, waterForGroup);
        }

    }
}

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command= scan.nextLine();
        double trunkCapacity=Double.parseDouble(command);
        int suitcases=0;
        while (true){
            command= scan.nextLine();
            if(command.equals("End")){
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }

            double suitcaseVolume=Double.parseDouble(command);
            if((suitcases+1)%3==0){
                suitcaseVolume+=suitcaseVolume*10.0/100;

            }
            if(trunkCapacity-suitcaseVolume<=0){
                System.out.println("No more space!");
                break;
            }else{
                trunkCapacity-=suitcaseVolume;
                suitcases++;
            }


        }
        System.out.printf("Statistic: %d suitcases loaded.%n", suitcases);
    }
}

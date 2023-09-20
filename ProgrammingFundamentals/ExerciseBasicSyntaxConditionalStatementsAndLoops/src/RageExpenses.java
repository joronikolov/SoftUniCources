import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headSetPrice=Double.parseDouble(scan.nextLine());
        double mousePrice=Double.parseDouble(scan.nextLine());
        double keyboardPrice=Double.parseDouble(scan.nextLine());
        double displayPrice=Double.parseDouble(scan.nextLine());
        int headsetCrashes=0;
        int keyboardCrashes=0;
        int mouseCrashes=0;
        int displayCrashes=0;
        for(int i=1; i<=lostGames;i++){
            boolean headsetCrash=false;
            boolean keyboardCrash=false;
            boolean mouseCrash=false;
            if(i%2==0){
                headsetCrash=true;
                headsetCrashes++;
            }
            if(i%3==0){
                mouseCrash=true;
                mouseCrashes++;
            }
            if(headsetCrash && mouseCrash){
                keyboardCrash=true;
                keyboardCrashes++;
            }
            if(keyboardCrashes%2==0 && keyboardCrash==true){
                displayCrashes++;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", headsetCrashes*headSetPrice+keyboardCrashes*keyboardPrice+mouseCrashes*mousePrice+displayCrashes*displayPrice);
    }
}
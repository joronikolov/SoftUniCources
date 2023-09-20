import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allSoldGames=scan.nextInt();
        scan.nextLine();
        int heartstone=0;
        int fortnite=0;
        int overwatch=0;
        int others=0;
        for(int i=1; i<=allSoldGames;i++){
            switch (scan.nextLine()){
                case "Hearthstone":
                    heartstone++;
                    break;
                case "Fornite":
                    fortnite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%nFornite - %.2f%%%nOverwatch - %.2f%%%nOthers - %.2f%%%n",1.0*heartstone/allSoldGames*100,
                1.0*fortnite/allSoldGames*100,1.0*overwatch/allSoldGames*100,1.0*others/allSoldGames*100);

    }
}

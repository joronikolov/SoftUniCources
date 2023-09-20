import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int absenceDays= scan.nextInt();
        scan.nextLine();
        int preparedFood= scan.nextInt();
        scan.nextLine();
        double firstDeer= scan.nextDouble();
        scan.nextLine();
        double secondDeer= scan.nextDouble();
        scan.nextLine();
        double thirdDeer= scan.nextDouble();
        scan.nextLine();
        double foodLeft=preparedFood*1.0-(firstDeer+secondDeer+thirdDeer)*absenceDays*1.0;
        if(foodLeft>=0){
            System.out.printf("%d kilos of food left.",(int) Math.floor(foodLeft));
        }else{
            System.out.printf("%d more kilos of food are needed.",(int) Math.ceil(Math.abs(foodLeft)));
        }

    }
}

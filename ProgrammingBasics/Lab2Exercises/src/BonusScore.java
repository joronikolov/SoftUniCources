import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = scan.nextInt();
        double bonus=0;
        if(points<=100){
            bonus=5;
        } else if (points<=1000) {
            bonus+=(double) points*20/100;
        }else {
            bonus+=(double)points*10/100;
        }
        if(points%2==0){
            bonus+=1;
        }
        if(String.valueOf(points).endsWith("5")){
            bonus+=2;
        }
        System.out.println(bonus);
        System.out.println((double)points+bonus);

    }
}

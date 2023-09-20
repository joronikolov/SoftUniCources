import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seriesName=scan.nextLine();
        int episodeDuration = scan.nextInt();
        int breakDuration=scan.nextInt();
        double lunchDuration=breakDuration*1d/8d;
        double restTime = breakDuration*1d/4d;
        if(breakDuration-lunchDuration-restTime-episodeDuration>=0){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",seriesName,Math.ceil(breakDuration-lunchDuration-restTime-episodeDuration));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",seriesName,Math.ceil(Math.abs(breakDuration-lunchDuration-restTime-episodeDuration)));;
        }
    }
}

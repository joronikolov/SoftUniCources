import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int minutes =scan.nextInt();
        int sumMinutes=hours*60+minutes+15;
        hours=sumMinutes/60;
        if(hours>=24){
            hours-=24;
        }
        minutes=sumMinutes%60;
        System.out.printf("%d:%02d", hours,minutes);
    }
}

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes=hour*60+minutes+30;
        hour = minutes/60;
        if(hour>23){
            hour-=24;
        }
        minutes=minutes%60;
        System.out.printf("%d:%02d", hour, minutes);
    }
}

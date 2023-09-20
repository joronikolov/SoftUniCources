import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = scan.nextInt();
        int examMinute = scan.nextInt();
        int arrivalHour = scan.nextInt();
        int arrivalMinute = scan.nextInt();

        int examInMinutes = examHour*60+examMinute;
        int arrivalInMinutes=arrivalHour*60+arrivalMinute;

        if (examInMinutes-arrivalInMinutes>30){
            System.out.println("Early");
            if(examInMinutes-arrivalInMinutes<60){
                System.out.printf("%2d minutes before the start",Math.abs(examInMinutes-arrivalInMinutes));
            }else {
                System.out.printf("%d:%02d hours before the start",(examInMinutes-arrivalInMinutes)/60,(examInMinutes-arrivalInMinutes)%60);
            }
        } else if (examInMinutes-arrivalInMinutes<=30&&examInMinutes-arrivalInMinutes>=0) {
            System.out.println("On time");
            if(examInMinutes-arrivalInMinutes<60&&examInMinutes-arrivalInMinutes!=0){
                System.out.printf("%d minutes before the start",Math.abs(examInMinutes-arrivalInMinutes));
            }
        } else if (examInMinutes-arrivalInMinutes<0) {
            System.out.println("Late");
            if(Math.abs(examInMinutes-arrivalInMinutes)<60){
                System.out.printf("%2d minutes after the start",Math.abs(examInMinutes-arrivalInMinutes) );
            }else {
                System.out.printf("%d:%02d hours after the start",Math.abs(examInMinutes-arrivalInMinutes)/60,Math.abs(examInMinutes-arrivalInMinutes)%60);
            }
        }
    }
}

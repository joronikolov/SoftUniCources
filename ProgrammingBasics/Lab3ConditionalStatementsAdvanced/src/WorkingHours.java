import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        scan.nextLine();
        String day=scan.nextLine();

        if (hour>=10 && hour<=18 && (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday"))){
            System.out.println("open");
        }else{
            System.out.println("closed");
        }

    }
}

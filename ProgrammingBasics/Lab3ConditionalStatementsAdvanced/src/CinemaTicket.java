import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayOfTheWeek = scan.nextLine();
        int price=0;
        if(dayOfTheWeek.equals("Monday")||dayOfTheWeek.equals("Tuesday")||dayOfTheWeek.equals("Friday")){
price=12;
        } else if (dayOfTheWeek.equals("Wednesday")|| dayOfTheWeek.equals("Thursday")) {
            price=14;
            
        } else if (dayOfTheWeek.equals("Saturday")||dayOfTheWeek.equals("Sunday")) {
            price=16;
            
        }
        System.out.println(price);
    }
}

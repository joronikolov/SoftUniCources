
import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        double years=input*100;
      double days=years*365.2422;
      double hours=days*24;
      double minutes=hours*60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", input,years,days,hours,minutes);

    }
}

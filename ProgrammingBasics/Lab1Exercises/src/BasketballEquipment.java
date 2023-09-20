import java.util.Scanner;

public class BasketballEquipment {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int annualPrice=scan.nextInt();
            scan.nextLine();
            double snickers = (double)annualPrice-(double)annualPrice*40/100;
            double clothes = snickers-snickers*20/100;
            double ball = clothes/4;
            double accessories = ball/5;
            System.out.println(annualPrice+snickers+clothes+ball+accessories);


        }


}

import java.util.Scanner;

public class FoodDelivery {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double chickenMenu = 10.35;
            double fishMenu = 12.4;
            double vegyMenu = 8.15;


            int chicken = Integer.parseInt(scan.nextLine());
            int fish = scan.nextInt();
            int vegetarian =scan.nextInt();
            // System.out.printf("((%s+2)*%s)+((%s*10/100)+%s)*%s+(%s*%s)+0.4%n", nylon,nylonPerSqMet,paint, paint, paintPerLiter,thinner,thinnerPerLiter);
            double totalOrderPrice=chickenMenu*chicken+fishMenu*fish+vegyMenu*vegetarian;
            double totalPrice=totalOrderPrice+totalOrderPrice*20/100+2.5;
            System.out.println(totalPrice);


        }


}

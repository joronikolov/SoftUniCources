import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nylonPerSqMet = 1.5;
        double paintPerLiter = 14.5;
        double thinnerPerLiter = 5;


        int nylon = Integer.parseInt(scan.nextLine());
        int paint = scan.nextInt();
        int thinner =scan.nextInt();
        int hours =scan.nextInt();
       // System.out.printf("((%s+2)*%s)+((%s*10/100)+%s)*%s+(%s*%s)+0.4%n", nylon,nylonPerSqMet,paint, paint, paintPerLiter,thinner,thinnerPerLiter);
double totalMaterialPrice=((nylon+2)*nylonPerSqMet)+(((double) paint*10/100)+(double)paint)*paintPerLiter+(thinner*thinnerPerLiter)+0.4;
      //  System.out.println(totalMaterialPrice);
        double totalPrice=totalMaterialPrice+((totalMaterialPrice*30/100))*hours;
        System.out.println(totalPrice);


    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(power(number,power)));



    }

    public static double power(double number, double power){
        double result =1;
        for(int i=0; i<power; i++){
           result*=number;
        }
        return result;
    }

}

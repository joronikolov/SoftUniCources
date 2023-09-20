import java.util.Scanner;

public class RadToDegrees {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double coefficient = 180/Math.PI;
            double amount = Double.parseDouble(scan.nextLine());
            System.out.println(coefficient*amount);
        }



}

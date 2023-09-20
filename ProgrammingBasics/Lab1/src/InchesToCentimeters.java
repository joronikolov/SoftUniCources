import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        double coefficient = 2.54;
        Scanner scan = new Scanner(System.in);
        double res = scan.nextDouble()*coefficient;
        System.out.println(res);
    }
}

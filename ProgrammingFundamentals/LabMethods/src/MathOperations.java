import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();
        double b = Double.parseDouble(scan.nextLine());

        switch (operator){
            case "+":
                System.out.println(new DecimalFormat("0.##").format(add(a,b)));
                break;
            case "-":
                System.out.println(new DecimalFormat("0.##").format(subtract(a,b)));
                break;
            case "/":
                System.out.println(new DecimalFormat("0.##").format(divide(a,b)));
                break;
            case "*":
                System.out.println(new DecimalFormat("0.##").format(multiply(a,b)));
                break;

        }

    }

    public static double add(double a, double b){

        return a+b;
    }
    public static double subtract(double a, double b){

        return a-b;
    }
    public static double multiply(double a, double b){

        return a*b;
    }
    public static double divide(double a, double b){

        return a/b;
    }
}

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scan.nextLine());
        double secondNumber = Double.parseDouble(scan.nextLine());
        if(Math.abs(firstNumber-secondNumber)<0.000001){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}

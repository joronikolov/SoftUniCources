import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int sortedFirst=0;
        int sortedSecond=0;
        int sortedThird=0;
        if (firstNumber<=secondNumber && firstNumber<=thirdNumber){
            sortedFirst=firstNumber;
            if (secondNumber<=thirdNumber){
                sortedSecond=secondNumber;
                sortedThird=thirdNumber;
            }else {
                sortedSecond=thirdNumber;
                sortedThird=secondNumber;

            }
        }else if (secondNumber<=firstNumber && secondNumber<=thirdNumber){
            sortedFirst=secondNumber;
            if (firstNumber<=thirdNumber){
                sortedSecond=firstNumber;
                sortedThird=thirdNumber;
            }else {
                sortedSecond=thirdNumber;
                sortedThird=firstNumber;

            }
        }else if (thirdNumber<=firstNumber && thirdNumber<=secondNumber){
            sortedFirst=thirdNumber;
            if (firstNumber<=secondNumber){
                sortedSecond=firstNumber;
                sortedThird=secondNumber;
            }else {
                sortedSecond=secondNumber;
                sortedThird=firstNumber;

            }
        }
        System.out.printf("%d%n%d%n%d%n", sortedThird,sortedSecond,sortedFirst);
    }
}
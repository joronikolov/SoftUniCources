import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(sumEven(number)*sumOdd(number));

    }


    public static int sumEven(int number) {
        int sum = 0;

        while (number > 0) {

            if((number%10)%2==0){
                sum+=number%10;
            }
            number/=10;

        }
    return sum;

    }
    public static int sumOdd(int number) {
        int sum = 0;

        while (number > 0) {

            if((number%10)%2!=0){
                sum+=number%10;
            }
            number/=10;

        }
        return sum;

    }

}

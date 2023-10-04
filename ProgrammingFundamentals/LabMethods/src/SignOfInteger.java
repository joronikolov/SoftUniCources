import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number =Integer.parseInt(scan.nextLine());
        getSign(number);
    }
    public static void getSign(int number){
        if(number>0){
            System.out.printf("The number %d is positive.", number);
        }else if(number<0){
            System.out.printf("The number %d is negative.", number);
        }else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int lastNumber=Integer.parseInt(number);
        for(int i=number.length()-1;i>=1;i--){
            int divider =Integer.parseInt("1"+"0".repeat(i));
            lastNumber=lastNumber%divider;
        }

        switch (lastNumber){
            case 1:
                System.out.println("one");
                break;
                case 2:
                System.out.println("Two".toLowerCase());
                break;
                case 3:
                System.out.println("Three".toLowerCase());
                break;
                case 4:
                System.out.println("Four".toLowerCase());
                break;
                case 5:
                System.out.println("Five".toLowerCase());
                break;
                case 6:
                System.out.println("Six".toLowerCase());
                break;
                case 7:
                System.out.println("Seven".toLowerCase());
                break;
                case 8:
                System.out.println("Eight".toLowerCase());
                break;
                case 9:
                System.out.println("Nine".toLowerCase());
                break;
                case 0:
                System.out.println("Zero".toLowerCase());
                break;

        }


    }
}
import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String firstChar = String.valueOf(input.charAt(0));
       if(firstChar.equals(firstChar.toUpperCase())){
           System.out.println("upper-case");
       }else {
           System.out.println("lower-case");
       }
    }
}

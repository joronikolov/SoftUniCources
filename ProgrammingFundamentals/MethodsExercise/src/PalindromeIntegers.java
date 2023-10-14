import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")){
            System.out.println(isPalindrome(input));
            input= scan.nextLine();
        }


    }
        public static boolean isPalindrome(String input){
        String opposite ="";
        boolean b = false;
        for (int i = input.length()-1; i >=0; i--){
            opposite=opposite+String.valueOf(input.charAt(i));
        }
        if (opposite.equals(input)){
            b = true;
        }
        return b;
        }
}

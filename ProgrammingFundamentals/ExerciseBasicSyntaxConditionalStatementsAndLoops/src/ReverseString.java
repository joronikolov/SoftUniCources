import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String reversedString="";
        for(int i=string.length()-1;i>=0;i--){
            reversedString+=string.charAt(i);
        }
        System.out.printf(reversedString);




    }
}
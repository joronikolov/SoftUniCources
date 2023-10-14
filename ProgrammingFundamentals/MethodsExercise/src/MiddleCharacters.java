import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        printMiddle(input);

    }
public static void printMiddle(String input){
        int len = input.length();
        int num=0;
        if(len%2==0){
            num=1;
        }else{
            num=0;
        }
    for (int i = len/2-num; i<=len/2; i++){
        System.out.printf("%c", input.charAt(i));
    }
}
}

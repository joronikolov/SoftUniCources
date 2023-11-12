import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();
        for (char ch: input
             ) {
            System.out.print((char)(ch+3));
        }
    }
}

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char one = scan.nextLine().charAt(0);
        char two = scan.nextLine().charAt(0);
        char three = scan.nextLine().charAt(0);
        System.out.printf("%c %c %c", three,two,one);
    }
}

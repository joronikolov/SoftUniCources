import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String separator = scan.nextLine();
        System.out.printf("%s%s%s", firstName,separator,lastName);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] row = scan.nextLine().split(", ");
        Arrays.stream(row).filter(e->e.length()>=3 && e.length()<=16 && e.replaceAll("[a-zA-Z0-9\\-\\_]", "").isEmpty()).forEach(System.out::println);
    }
}

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Hello, %s!", scan.nextLine());
    }
}

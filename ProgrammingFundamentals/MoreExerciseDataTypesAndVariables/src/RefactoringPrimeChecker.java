import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= number; i++) {

            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    primeNumber = false;

                    break;

                }

            }

            System.out.printf("%d -> %b%n", i, primeNumber);

        }
    }
}

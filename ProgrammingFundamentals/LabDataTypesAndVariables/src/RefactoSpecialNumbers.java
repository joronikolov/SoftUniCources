import java.util.Scanner;

public class RefactoSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());







        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            int processing=currentNumber;
            int   sum=0;
            while (processing > 0) {
             sum += processing % 10;
                processing = processing / 10;
            }
            boolean isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            String upperBoolean = String.valueOf(String.valueOf(isSpecialNumber).charAt(0)).toUpperCase()+String.valueOf(isSpecialNumber).substring(1);
            System.out.printf("%d -> %s%n", currentNumber,
                    upperBoolean);
            sum = 0;
        }

    }
}

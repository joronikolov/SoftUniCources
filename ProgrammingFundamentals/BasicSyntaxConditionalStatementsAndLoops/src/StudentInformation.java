import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String name=scan.nextLine();
       int age = scan.nextInt();
       scan.nextLine();
       double grade = Double.parseDouble(scan.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
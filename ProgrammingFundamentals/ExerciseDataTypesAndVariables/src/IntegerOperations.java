import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne=Integer.parseInt(scan.nextLine());
        int numberTwo=Integer.parseInt(scan.nextLine());
        int numberThree=Integer.parseInt(scan.nextLine());
        int numberFour=Integer.parseInt(scan.nextLine());
        int result = ((numberOne+numberTwo)/numberThree)*numberFour;
        System.out.println(result);

    }
}

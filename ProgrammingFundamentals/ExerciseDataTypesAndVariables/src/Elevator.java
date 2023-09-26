import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPeople=Integer.parseInt(scan.nextLine());
        int capacity=Integer.parseInt(scan.nextLine());

        double result =Math.ceil((double)numPeople/capacity);
        System.out.printf("%.0f",result);

    }
}

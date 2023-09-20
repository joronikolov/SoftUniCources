import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projectionType=scan.nextLine();
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        double price=0d;
        switch (projectionType){
            case "Premiere":
                price=12d;
                break;
            case "Normal":
                price=7.5;
                break;
            case "Discount":
                price=5d;
                break;
            default:
                price=0d;
                break;
        }
        System.out.printf("%.2f leva", rows*columns*price);
    }
}

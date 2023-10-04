import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        System.out.printf("%.0f", getArea(width, length));



    }

    public static double getArea(double width, double length){

    return width*length;
    }

}

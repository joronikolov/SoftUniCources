import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int length = Integer.parseInt(scan.nextLine());
        int width = scan.nextInt();
        int height =scan.nextInt();
        double percent = scan.nextDouble();
        // System.out.printf("((%s+2)*%s)+((%s*10/100)+%s)*%s+(%s*%s)+0.4%n", nylon,nylonPerSqMet,paint, paint, paintPerLiter,thinner,thinnerPerLiter);
        double totalVolume=(double)length*(double)height*(double)width;
        double result=totalVolume-totalVolume*percent/100;
        System.out.println(result/1000);


    }
}

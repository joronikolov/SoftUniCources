import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dbl = scan.nextDouble();
         if(dbl<=10){
             System.out.println("slow");
         } else if (dbl>10 & dbl<=50) {
             System.out.println("average");
         } else if (dbl>50 & dbl<=150) {
             System.out.println("fast");
         } else if (dbl>150 & dbl<=1000) {
             System.out.println("ultra fast");
         }else{
             System.out.println("extremely fast");
         }


    }
}

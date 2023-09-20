import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int orders = Integer.parseInt(scan.nextLine());
        double sum=0;
for(int i =0; i<orders;i++){

   double pricePerCapsule = Double.parseDouble(scan.nextLine());
   int days = Integer.parseInt(scan.nextLine());
   int count = Integer.parseInt(scan.nextLine());
    System.out.printf("The price for the coffee is: $%.2f%n",((days*count)*pricePerCapsule));
sum+=((days*count)*pricePerCapsule);

}
        System.out.printf("Total: $%.2f",sum);
    }
}
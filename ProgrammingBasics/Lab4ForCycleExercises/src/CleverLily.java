import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age= scan.nextInt();
        double wmPrice= scan.nextDouble();
        int toyPrice= scan.nextInt();
        int toys=0;
        int money=0;
        for (int i =1; i<=age;i++) {
        if(i%2!=0){
            toys++;
        }else{
            money+=10*i/2-1;
        }
        }
        money+=toys*toyPrice;
        if(money-wmPrice>=0){
            System.out.printf("Yes! %.2f",(double)money-wmPrice);
        }else{
            System.out.printf("No! %.2f",Math.abs((double)money-wmPrice));
        }

    }
}

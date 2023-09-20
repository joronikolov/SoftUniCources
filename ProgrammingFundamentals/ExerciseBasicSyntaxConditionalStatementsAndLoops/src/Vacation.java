import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String stayDay = scan.nextLine();
        double price=0;
        double totalPrice=0;

       switch(groupType){
           case "Students":
               switch (stayDay){
                   case "Friday":
                       price=8.45;
                       break;
                   case "Saturday":
                       price=9.80;
                       break;
                   case "Sunday":
                       price=10.46;
                       break;
               }
               totalPrice=price*num;
               if(num>=30){
                   totalPrice=totalPrice-totalPrice*0.15;
               }
               break;
           case "Business":
               switch (stayDay){
                   case "Friday":
                       price=10.90;
                       break;
                   case "Saturday":
                       price=15.60;
                       break;
                   case "Sunday":
                       price=16;
                       break;
               }

               if(num>=100){
                   num-=10;
               }
               totalPrice=price*num;
               break;
           case "Regular":
               switch (stayDay){
                   case "Friday":
                       price=15;
                       break;
                   case "Saturday":
                       price=20;
                       break;
                   case "Sunday":
                       price=22.50;
                       break;
               }
               totalPrice=price*num;
               if(num>=10 && num<=20){
                   totalPrice=totalPrice-totalPrice*0.05;
               }
               break;
       }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
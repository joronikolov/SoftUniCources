import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String dayOfTheWeek = scan.nextLine();
        double quantity = scan.nextDouble();
        double price=0d;
        boolean error=false;
        if(dayOfTheWeek.equals("Sunday")||dayOfTheWeek.equals("Saturday")){
            if(fruit.equals("banana")){
                price=2.7;
            } else if (fruit.equals("apple")) {
                price=1.25;
            }else if (fruit.equals("orange")) {
                price=0.9;
            }else if (fruit.equals("grapefruit")) {
                price=1.6;
            }else if (fruit.equals("kiwi")) {
                price=3;
            }else if (fruit.equals("pineapple")) {
                price=5.6;
            }else if (fruit.equals("grapes")) {
                price=4.2;
            }
            else {
                error=true;
            }


        } else if (dayOfTheWeek.equals("Monday")||dayOfTheWeek.equals("Tuesday")||dayOfTheWeek.equals("Wednesday")||dayOfTheWeek.equals("Thursday")||dayOfTheWeek.equals("Friday")) {
            if(fruit.equals("banana")){
                price=2.5;
            } else if (fruit.equals("apple")) {
                price=1.20;
            }else if (fruit.equals("orange")) {
                price=0.85;
            }else if (fruit.equals("grapefruit")) {
                price=1.45;
            }else if (fruit.equals("kiwi")) {
                price=2.7;
            }else if (fruit.equals("pineapple")) {
                price=5.5;
            }else if (fruit.equals("grapes")) {
                price=3.85;
            }
            else {
                error=true;

            }

        }else {
            error=true;
        }
        if(!error) {
            System.out.printf("%.2f", price * quantity);
        }else {
            System.out.println("error");
        }

    }
}

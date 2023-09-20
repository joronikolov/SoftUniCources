import java.util.Scanner;
//град / продукт coffee water beer sweets peanuts
//
//        Sofia 0.50 0.80 1.20 1.45 1.60
//
//        Plovdiv 0.40 0.70 1.15 1.30 1.50
//
//        Varna 0.45 0.70 1.10 1.35 1.55
public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();


        double amount = scan.nextDouble();
        double price=0d;
        if(product.equals("coffee")){
            switch (city){
                case "Sofia":
                    price=0.5;
                    break;
                case "Plovdiv":
                    price=0.4;
                    break;
                case "Varna":
                    price=0.45;
                    break;

            }
        }
        else if(product.equals("water")){
            switch (city){
                case "Sofia":
                    price=0.8;
                    break;
                case "Plovdiv":
                    price=0.7;
                    break;
                case "Varna":
                    price=0.7;
                    break;

            }
        }else if(product.equals("beer")){
            switch (city){
                case "Sofia":
                    price=1.2;
                    break;
                case "Plovdiv":
                    price=1.15;
                    break;
                case "Varna":
                    price=1.1;
                    break;

            }
        }else if(product.equals("sweets")){
            switch (city){
                case "Sofia":
                    price=1.45;
                    break;
                case "Plovdiv":
                    price=1.3;
                    break;
                case "Varna":
                    price=1.35;
                    break;

            }
        }else if(product.equals("peanuts")){
            switch (city){
                case "Sofia":
                    price=1.6;
                    break;
                case "Plovdiv":
                    price=1.5;
                    break;
                case "Varna":
                    price=1.55;
                    break;

            }
        }
        System.out.println(price*amount);
    }
}

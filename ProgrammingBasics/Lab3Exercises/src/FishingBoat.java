import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = scan.nextInt();
        scan.nextLine();
        double price=0;
        String season = scan.nextLine();
        int fishermen = scan.nextInt();
        if(fishermen<=6){
            switch (season){
                case "Spring":
                    price=3000d-3000d*10d/100;
                    break;
                case "Summer":
                case "Autumn":
                    price=4200-4200*10d/100;
                    break;
                case "Winter":
                    price=2600-2600*10d/100;
                    break;
            }
        } else if(fishermen<=11&&fishermen>=7){
            switch (season){
                case "Spring":
                    price=3000d-3000d*15d/100;
                    break;
                case "Summer":
                case "Autumn":
                    price=4200-4200*15d/100;
                    break;
                case "Winter":
                    price=2600-2600*15d/100;
                    break;
            }
        }else if(fishermen>=12){
            switch (season){
                case "Spring":
                    price=3000d-3000d*25d/100;
                    break;
                case "Summer":
                case "Autumn":
                    price=4200-4200*25d/100;
                    break;
                case "Winter":
                    price=2600-2600*25d/100;
                    break;
            }
        }
        if(fishermen%2==0&&!season.equals("Autumn")){
            price-=price*5d/100;
        }
        if((double)budget-price>=0){
            System.out.printf("Yes! You have %.2f leva left.",(double)budget-price );
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs((double)budget-price));
        }
    }
}

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople = scan.nextInt();
        scan.nextLine();
        double pricePerPerson=0;
        String season = scan.nextLine();
        if(numberOfPeople<=5){
            switch (season){
                case "spring":
                    pricePerPerson=50;
                    break;
                case "summer":
                    pricePerPerson=48.5;
                    pricePerPerson-=pricePerPerson*0.15;
                    break;
                case "autumn":
                    pricePerPerson=60;
                    break;
                case "winter":
                    pricePerPerson=86;
                    pricePerPerson+=pricePerPerson*0.08;
                    break;

            }
        }else {
            switch (season){
                case "spring":
                    pricePerPerson=48;
                    break;
                case "summer":
                    pricePerPerson=45;
                    pricePerPerson-=pricePerPerson*0.15;
                    break;
                case "autumn":
                    pricePerPerson=49.5;
                    break;
                case "winter":
                    pricePerPerson=85;
                    pricePerPerson+=pricePerPerson*0.08;
                    break;

            }
        }
        System.out.printf("%.2f leva.",pricePerPerson*numberOfPeople);
    }

}

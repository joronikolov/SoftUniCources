import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contractPeriod = scan.nextLine();
        String contractType = scan.nextLine();
        String addedMobileInternet = scan.nextLine();
        int monthsToPay= scan.nextInt();
        scan.nextLine();
        Map<String, Map<String,Double>> prices = new HashMap<>();
        Map<String,Double> oneYearPrices = new HashMap<>();
        oneYearPrices.put("Small", 9.98);
        oneYearPrices.put("Middle", 18.99);
        oneYearPrices.put("Large", 25.98);
        oneYearPrices.put("ExtraLarge", 35.99);
        Map<String,Double> twoYearsPrices = new HashMap<>();
        twoYearsPrices.put("Small", 8.58);
        twoYearsPrices.put("Middle", 17.09);
        twoYearsPrices.put("Large", 23.59);
        twoYearsPrices.put("ExtraLarge", 31.79);

        prices.put("one",oneYearPrices);
        prices.put("two",twoYearsPrices);
        double price= prices.get(contractPeriod).get(contractType);
        if(addedMobileInternet.equals("yes")){
            if(price<=10){
                price+=5.5;
            } else if (price<=30) {
                price+=4.35;
            }else {
                price+=3.85;
            }
        }
        double overallPrice=price*monthsToPay;
        if(contractPeriod.equals("two")){
            overallPrice=overallPrice-overallPrice*3.75/100;
        }

        System.out.printf("%.2f lv.",overallPrice);
    }
}

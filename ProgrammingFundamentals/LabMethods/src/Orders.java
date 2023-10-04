import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f", calculateTotalPrice(product,quantity));



    }

    public static double calculateTotalPrice(String product, int quantity){
    Map<String, Double> catalog = new HashMap<>();
    catalog.put("coffee" , 1.50);
    catalog.put("water" , 1.00);
    catalog.put("coke" , 1.40);
    catalog.put("snacks" , 2.00);
    return catalog.get(product)*quantity;
    }

}

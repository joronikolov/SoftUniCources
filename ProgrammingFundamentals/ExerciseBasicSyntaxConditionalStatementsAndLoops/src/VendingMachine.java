import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command=scan.nextLine();
        double totalMoney = 0;
        List<Double> permitedCoins=new ArrayList(Arrays.asList(0.1, 0.2, 0.5, 1.0, 2.0)) ;
        HashMap<String, Double> allowedProducts = new HashMap<>();
        allowedProducts.put("Nuts", 2.0);
        allowedProducts.put("Water", 0.7);
        allowedProducts.put("Crisps", 1.5);
        allowedProducts.put("Soda", 0.8);
        allowedProducts.put("Coke", 1.0);
        while (!command.equals("Start")){
            double currentCoin=Double.parseDouble(command);

            if(permitedCoins.contains(currentCoin)){
               totalMoney+=currentCoin;
            }else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);

            }
            command=scan.nextLine();

        }
        if(command.equals("Start")){
            command=scan.nextLine();
        }
        while (!command.equals("End")){

            if(allowedProducts.containsKey(command)){
        if(totalMoney-allowedProducts.get(command)>=0){
                totalMoney-=allowedProducts.get(command);
                System.out.printf("Purchased %s%n", command);
            }else {
            System.out.println("Sorry, not enough money");
        }

        }else {
                System.out.println("Invalid product");
            }
            command=scan.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Double> gamesCatalogue = new HashMap<>();
        gamesCatalogue.put("OutFall 4", 39.99);
        gamesCatalogue.put("CS: OG", 15.99);
        gamesCatalogue.put("Zplinter Zell", 19.99);
        gamesCatalogue.put("Honored 2", 59.99);
        gamesCatalogue.put("RoverWatch", 29.99);
        gamesCatalogue.put("RoverWatch Origins Edition", 39.99);
        double currenrBalance = Double.parseDouble(scan.nextLine());
        double totalSpent=0;
        String command = scan.nextLine();
        while (!command.equals("Game Time")){
            if(currenrBalance>0){
                if(gamesCatalogue.containsKey(command)){
                    if(currenrBalance-gamesCatalogue.get(command)>=0){
                        currenrBalance-=gamesCatalogue.get(command);
                        System.out.printf("Bought %s%n", command);
                        totalSpent+=gamesCatalogue.get(command);
                    }else {
                        System.out.println("Too Expensive");

                    }
                }else {
                    System.out.println("Not Found");
                }
                command=scan.nextLine();
            }else {
                System.out.println("Out of money!");
                break;
            }
        }
        if(currenrBalance==0){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currenrBalance);
        }
    }
}
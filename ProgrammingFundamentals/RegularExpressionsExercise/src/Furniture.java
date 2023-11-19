import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> shopList = new LinkedList<>();
        Pattern pat = Pattern.compile(">>(?<product>[A-Za-z]+)<<(?<price>\\d+\\.*\\d*)!(?<quantity>\\d+)");
        double sum = 0;
        while(!input.equals("Purchase")){

            Matcher matcher = pat.matcher(input);
            if(matcher.find()){
                shopList.add(matcher.group("product"));
                sum+= Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("quantity"));

            }
            input = scan.nextLine();

        }
        System.out.println("Bought furniture:");
        shopList.forEach((k)-> System.out.printf("%s%n", k));
        System.out.printf("Total money spend: %.2f%n", sum);
    }
}

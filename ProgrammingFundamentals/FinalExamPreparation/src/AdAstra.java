import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodInfo = scan.nextLine();
        String regex = "([|#])(?<itemName>[A-Za-z\\s]+)\\1(?<expDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]{1,4})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(foodInfo);
        List<String> text = new LinkedList<>();
        int calories = 0;
        while(matcher.find()){
            calories+=Integer.parseInt(matcher.group("calories"));
            text.add(String.format("Item: %s, Best before: %s, Nutrition: %s", matcher.group("itemName"), matcher.group("expDate"), matcher.group("calories")));
        }
        System.out.printf("You have food to last you for: %d days!%n", calories/2000);
        text.forEach(System.out::println);

    }
}

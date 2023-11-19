import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> shopList = new LinkedList<>();
        Pattern pat = Pattern.compile("(?<name>\\b[A-Z]+[a-z]+\\b)%[^|%$.]*<(?<product>\\w+)>[^|%$.]*\\|(?<quantity>\\d+)\\|[^|%$.\\d]*(?<price>\\d+\\.*\\d*)\\$");
        double sum = 0;
        while (!input.equals("end of shift")) {

            Matcher matcher = pat.matcher(input);
            if (matcher.find()) {
                shopList.add(input);

            }
            input = scan.nextLine();

        }
        for (String s : shopList) {
            Matcher matcher = pat.matcher(s);
            while (matcher.find()) {
                System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"), Integer.parseInt( matcher.group("quantity")) * Double.parseDouble(matcher.group("price")));
                sum += Integer.parseInt(matcher.group("quantity")) * Double.parseDouble(matcher.group("price"));

            }

        }
        System.out.printf("Total income: %.2f", sum);
    }
}

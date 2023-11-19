import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("(?<userName>\\b[^\\.\\-_\\s][a-zA-Z0-9\\.\\-\\_]+[^\\.\\-_\\s])@(?<host>[^.\\-_\\s][a-zA-Z\\-]+\\.[a-zA-Z\\-\\.]+[^\\.\\-_\\s]\\b)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
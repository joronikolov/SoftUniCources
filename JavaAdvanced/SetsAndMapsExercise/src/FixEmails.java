import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();
        while(!"stop".equals(command)){
            String email = scan.nextLine();
            Pattern pattern = Pattern.compile(".*@.*\\.(us|com|uk)$");
            Matcher matcher = pattern.matcher(email);
            if(!matcher.find()) {
                emails.putIfAbsent(command, email);
            }
            command = scan.nextLine();
        }
        emails.forEach((k, v)->System.out.printf("%s -> %s%n", k, v));
    }
}

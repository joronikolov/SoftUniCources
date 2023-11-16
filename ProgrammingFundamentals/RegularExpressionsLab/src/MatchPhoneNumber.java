import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> result= new LinkedList<>();
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher match = pattern.matcher(input);
        while(match.find()){
            result.add(match.group());
        }
        System.out.println(String.join(", ", result));
    }
}

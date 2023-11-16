import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> result= new LinkedList<>();
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher match = pattern.matcher(input);
        while(match.find()){
            System.out.printf("%s ", match.group());
        }
    }
}

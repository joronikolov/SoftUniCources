import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})(.+)(?<month>[A-Za-z]+)\\2(?<year>\\d{4})\\b");
        Matcher match = pattern.matcher(input);
        while(match.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s%n", match.group("day"), match.group("month"), match.group("year"));
        }
    }
}

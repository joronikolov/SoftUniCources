import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> star = Arrays.asList("star".split(""));
        String[] input = scan.nextLine().split("\\s*,\\s*");
        for (String s : input
             ) {
            int stength = 0;
            Pattern pattern = Pattern.compile("[^0-9+\\-*\\/.]+");
            Matcher matcher = pattern.matcher(s);
            while(matcher.find()){
                for(char c : matcher.group().toCharArray())
                    stength+= c;
            }
            double baseDamage=0;
            pattern = Pattern.compile("([-+]*\\d+\\.*\\d*)");
            matcher = pattern.matcher(s);
            while (matcher.find()){
                baseDamage+=Double.parseDouble(matcher.group());
            }
            pattern = Pattern.compile("[/*]+");
            matcher = pattern.matcher(s);
            while(matcher.find()){
                for(String g : matcher.group().split("")) {
                    if (g.equals("/")) {
                        baseDamage /= 2;
                    } else if (g.equals("*")) {
                        baseDamage *= 2;
                    }
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", s, stength, baseDamage);
        }
    }

}


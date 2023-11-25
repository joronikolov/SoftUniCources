import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String emojis = scan.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(emojis);
        StringBuilder numbers = new StringBuilder();
        Map<String, BigInteger> emoStat = new LinkedHashMap<>();
        while(matcher.find()){
            numbers.append(matcher.group());
        }
        BigInteger coolThreshold = new BigInteger("1");
        if(numbers.length()>0) {
            for (String s : numbers.toString().split("")
            ) {
                coolThreshold = coolThreshold.multiply(new BigInteger(s));
            }
        }
        final BigInteger coolThFinal = coolThreshold;
        pattern= Pattern.compile("(\\*{2}|:{2})[A-Z][a-z]{2,}+\\1");
        matcher = pattern.matcher(emojis);
        while (matcher.find()){
            long coolnes=0;
            for (char c : matcher.group().replaceAll("[\\*:]","").toCharArray()
                 ) {
                coolnes+=c;
            }
            emoStat.put(matcher.group(), new BigInteger(String.valueOf(coolnes)));
        }
        System.out.printf("Cool threshold: %s%n", coolThreshold.toString());
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emoStat.size());
        emoStat.entrySet().stream().
                filter(map-> map.getValue().compareTo(coolThFinal) >= 0).
                forEach(m->System.out.println(m.getKey()));
    }
}

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> star = Arrays.asList("star".split(""));
        List<String> listAttacked = new LinkedList<>();
        List<String> listDestroyed = new LinkedList<>();
        Pattern pattern = Pattern.compile("[^@\\-!:>]*@(?<planet>[a-zA-Z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)[^@\\-!:>]*");
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            String input = scan.nextLine();
            for (String c : input.split("")
            ) {
                if (star.contains(c.toLowerCase())) {
                    cnt++;
                }
            }
            final int finCount = cnt;
            StringBuilder encoded = new StringBuilder();
            Arrays.stream(input.split("")).forEach(v -> encoded.append((char) (v.charAt(0) - finCount)));
            Matcher matcher = pattern.matcher(encoded.toString());
            if(matcher.find()){
                if(matcher.group("attackType").equals("A")){
                    listAttacked.add(matcher.group("planet"));
                } else if (matcher.group("attackType").equals("D")) {
                    listDestroyed.add(matcher.group("planet"));
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", listAttacked.size());
        listAttacked.stream().sorted().forEach(l-> System.out.printf("-> %s%n", l));
        System.out.printf("Destroyed planets: %d%n", listDestroyed.size());
        listDestroyed.stream().sorted().forEach(l-> System.out.printf("-> %s%n", l));

    }
}


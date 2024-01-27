import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Map<Character, Integer> cnt = new TreeMap<>();
        for(char c : text.toCharArray()){
            if (!cnt.containsKey(c)){
                cnt.put(c, 1);
            }else {
                cnt.put(c, cnt.get(c)+1);
            }
        }
        cnt.forEach((k, v)->System.out.printf("%c: %d time/s%n", k, v));
    }

}

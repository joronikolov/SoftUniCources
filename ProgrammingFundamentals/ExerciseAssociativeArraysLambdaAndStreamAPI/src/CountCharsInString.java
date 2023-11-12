import java.util.*;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = Arrays.stream(scan.nextLine().split("")).filter(e->!e.equals(" ")).toArray(String[]::new);
        Map<String, Integer> cnt = new LinkedHashMap<>();
        for (String str : input
             ) {
            if(cnt.containsKey(str)){
                cnt.put(str, cnt.get(str)+1);

            }else {
                cnt.put(str, 1);
            }
        }
        cnt.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}

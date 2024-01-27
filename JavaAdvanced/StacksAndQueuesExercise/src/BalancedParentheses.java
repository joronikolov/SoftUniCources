import java.util.*;
import java.util.stream.Collectors;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());
        String results = isBalanced(input)?"YES":"NO";
        System.out.println(results);

    }
    private static boolean isBalanced(List<String> input){
        Deque<String> openParenthesesStack = new ArrayDeque<>();
        Map<String, String> parMap = new HashMap<>();
        parMap.put("{", "}");
        parMap.put("[", "]");
        parMap.put("(", ")");
        boolean result = false;
        for (String brace : input){
            if(!parMap.containsKey(brace) & !parMap.containsValue(brace)){
                return false;
            }else  if (parMap.containsKey(brace)){
             openParenthesesStack.push(brace);
            }else if(openParenthesesStack.isEmpty()) {
                return false;
            }else if (!brace.equals(parMap.get(openParenthesesStack.pop()))){
                return false;
            }
        }
        if(openParenthesesStack.isEmpty()){
            result = true;
        }
        return result;
    }
}

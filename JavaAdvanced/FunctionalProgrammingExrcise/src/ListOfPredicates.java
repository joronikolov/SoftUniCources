import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] seq = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        BiPredicate<Integer, Integer[]> isDividable = (a, b)->{
            boolean res=true;
            for(int j : b){
                if(a%j!=0){
                    res=false;
                    break;
                }
            }
            return res;
        };
        
       result.stream().filter(a->isDividable.test(a, seq)).forEach(a->System.out.printf("%d ", a));

        
        
    }
}

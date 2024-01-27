import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> input = new LinkedList<>();
        input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> min = (a) -> {
            int max = Integer.MAX_VALUE;
            int index=-1;
            int counter =-1;
            for(int i : a){
                counter++;
            if(i<=max){
                max=i;
                index=counter;
            }
            }
            return  index;
        } ;
        System.out.println(min.apply(input));
    }
}

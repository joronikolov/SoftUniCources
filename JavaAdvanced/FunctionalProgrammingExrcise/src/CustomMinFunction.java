import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[] :: new);
        Function<Integer[], Integer> min = (a) -> Arrays.stream(a).min(Comparator.naturalOrder()).get() ;
        System.out.println(min.apply(input));
    }
}

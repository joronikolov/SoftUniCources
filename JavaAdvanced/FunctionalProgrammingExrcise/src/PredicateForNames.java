import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BiPredicate<Integer, String> check = (a, b)-> b.length()<=a;
        int length = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split("\\s+");
        Arrays.stream(input).filter(a->check.test(length, a)).forEach(System.out::println);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        Consumer<String> pr = System.out::println;
        input.forEach(pr);


    }
}

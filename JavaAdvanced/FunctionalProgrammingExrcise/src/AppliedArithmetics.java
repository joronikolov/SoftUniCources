import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[] :: new);

        Function<Integer[], Integer[]> add = (a) -> Arrays.stream(a).map(b->b+1).toArray(Integer[]::new);
        Function<Integer[], Integer[]> multiply =  (a) -> Arrays.stream(a).map(b->b*2).toArray(Integer[]::new);
        Function<Integer[], Integer[]> subtract =  (a) -> Arrays.stream(a).map(b->b-1).toArray(Integer[]::new);
        Consumer<Integer> print = (a) -> System.out.printf("%d ", a);
        String command = scan.nextLine();
        Integer[] result = input;
        while(!"end".equals(command)){
            switch (command){
                case "add":
                    result=add.apply(result);
                  //  Arrays.stream(result).forEach(System.out::print);
                    break;
                case "multiply":
                    result=multiply.apply(result);
                 //   Arrays.stream(result).forEach(System.out::print);
                    break;
                case "subtract":
                    result=subtract.apply(result);
                 //   Arrays.stream(result).forEach(System.out::print);
                    break;
                case "print":
                    Arrays.stream(result).forEach(print);
                    System.out.println();
                    break;

            }
            command = scan.nextLine();
        }
    }

}

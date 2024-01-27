    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.List;
    import java.util.Scanner;
    import java.util.function.BiFunction;
    import java.util.function.Consumer;
    import java.util.function.Function;
    import java.util.stream.Collectors;

    public class ReverseAndExclude {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            BiFunction<Integer[],Integer, Integer[]> rev = (a, n) -> {
                Integer[] buffer = Arrays.stream(a).filter(b->b%n!=0).toArray(Integer[]::new);
                Integer[] result = Arrays.copyOf(buffer, buffer.length);
                for (int i=buffer.length-1; i>=0;i--){
                    result[buffer.length-1-i]=buffer[i];
                }
                return result;
            };
            Integer[] input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
            int divider = Integer.parseInt(scan.nextLine());
            Arrays.stream(rev.apply(input, divider)).forEach(a->System.out.printf("%d ", a));
        }
    }

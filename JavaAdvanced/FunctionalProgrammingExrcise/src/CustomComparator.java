import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiFunction;

public class CustomComparator {
    public static void main(String[] args) {
        Comparator<Integer> comp = (a, b) ->{
            int result=0;
            if(a%2==0 && b%2!=0){
                result= -11;
            } else if (a%2!=0 && b%2==0) {
                result= 1;
            }else {
                result = a.compareTo(b);
            }
            return  result;
        };

        Scanner scan = new Scanner(System.in);
        Integer[] input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(input, comp);
        Arrays.stream(input).forEach(a -> System.out.print(a+" "));
    }
}

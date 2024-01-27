import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        String[]  arr = scan.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            stack.push(Integer.parseInt(arr[i]));
        }
        stack.forEach(e -> System.out.printf("%d ", e));
    }
}

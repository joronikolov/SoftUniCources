import java.util.*;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque<Long> stack = new ArrayDeque<>();
        stack.push(0L);
        stack.push(1L);
        for(int i =0; i<n; i++){
            long a=stack.pop();
            long b = stack.pop();
            stack.push(a);
            stack.push(a+b);
        }
        System.out.println(stack.peek());


    }

}

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int el = stack.pop();
        System.out.println(el);
        System.out.println(stack.peek());
    }
}

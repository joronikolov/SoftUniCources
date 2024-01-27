import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int x = Integer.parseInt(arr[1]);
        int s = Integer.parseInt(arr[2]);
        String[] numbers = scan.nextLine().split("\\s+");
        Deque<Integer> stack = new ArrayDeque<>();
        PriorityQueue<Integer> priorQueue = new PriorityQueue<>();

        for (int i=0; i<n; i++){
            stack.push(Integer.parseInt(numbers[i]));
        }
        for (int i=0; i<x; i++){
            stack.pop();
        }
        stack.forEach(priorQueue::offer);

        System.out.println(stack.isEmpty()?"0":stack.contains(s)?"true":priorQueue.peek());

    }
}

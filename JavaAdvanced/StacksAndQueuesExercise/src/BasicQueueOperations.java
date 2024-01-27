import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        String[] numbers = scan.nextLine().split("\\s+");
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i=0; i<n; i++){
            queue.offer(Integer.parseInt(numbers[i]));
        }
        for (int i=0; i<s; i++){
            queue.poll();
        }

        System.out.println(queue.isEmpty()?"0":queue.contains(x)?"true":Collections.min(queue));
    }
}

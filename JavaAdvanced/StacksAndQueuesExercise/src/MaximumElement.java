import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        PriorityQueue<Integer> priorQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split("\\s+");


            switch(command[0]){
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                   // System.out.println(command[1]);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    stack.forEach(priorQueue::offer);
                    System.out.println(priorQueue.peek());
                    priorQueue.removeAll(priorQueue);
                    break;
            }
        }

    }
}

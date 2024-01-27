import java.util.*;
import java.util.stream.Collectors;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> buffer = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<String[]> lastAction = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split(" ");
            switch (command[0]) {
                case "1":

                    lastAction.push(new String[]{"2",String.valueOf(command[1].length())});
                    for(char c : command[1].toCharArray()){
                        stack.push(c);
                    }
                    break;
                case "2":
                    StringBuilder sb = new StringBuilder();
                    for(int j=0; j<Integer.parseInt(command[1]); j++){
                        sb.append(stack.pop());

                }
                    lastAction.push(new String[]{"1", sb.reverse().toString()});
                    sb.setLength(0);
                    break;
                case "3":
                    List<Character> stackList = stack.stream().collect(Collectors.toList());

                    System.out.println(stackList.get(stackList.size()-Integer.parseInt(command[1])));


                    break;
                case "4":
                String[] undo = lastAction.pop();
                if("1".equals(undo[0])){
                    for(char c : undo[1].toCharArray()){
                        stack.push(c);
                    }
                }else if("2".equals(undo[0])){
                    for(int j=0; j<Integer.parseInt(undo[1]); j++){
                        stack.pop();
                    }
                }
                    break;
            }
        }
    }
}

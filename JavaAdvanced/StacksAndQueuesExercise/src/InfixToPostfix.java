import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArray = scan.nextLine().split("\\s");
        String res=inToPostfix(inputArray).toString().replaceAll("[\\[\\],]","");
        System.out.printf(res);
    }
    private static Deque<String> inToPostfix(String[] inputArray){
        Deque<String> outputQueue = new ArrayDeque<>();
        Deque<String> operatorsStack = new ArrayDeque<>();
        Map<String, Integer> precedence = new HashMap<>();
        precedence.put("+", 1);
        precedence.put("-", 1);
        precedence.put("*", 2);
        precedence.put("/", 2);
        precedence.put("^", 3);
        precedence.put("(", 9);
        for(String s : inputArray){
            if(")".equals(s)){
                while (!operatorsStack.peek().equals("(")){
                    outputQueue.offer(operatorsStack.pop());
                }
                operatorsStack.pop();
            }
            else if(!precedence.containsKey(s)){
                outputQueue.offer(s);
            }else {
                if(operatorsStack.isEmpty()  ){
                    operatorsStack.push(s);
                } else if (precedence.get(s)>precedence.get(operatorsStack.peek())) {
                    operatorsStack.push(s);
                } else {
                    boolean z =false;
                    if(!operatorsStack.isEmpty()) {
                        if (precedence.get(s) <= precedence.get(operatorsStack.peek()) & !operatorsStack.peek().equals("(")) {
                            z = true;
                        }
                    }
                    while( z){
                            outputQueue.offer(operatorsStack.pop());
                            z=false;
                        if(!operatorsStack.isEmpty()) {
                            if (precedence.get(s) <= precedence.get(operatorsStack.peek()) & !operatorsStack.peek().equals("(")) {
                                z = true;
                            }
                        }
                    }
                    operatorsStack.push(s);

                }
            }
        }
        if (!operatorsStack.isEmpty()){
            operatorsStack.forEach(outputQueue::offer);
        }
        return outputQueue;
    }
}

package ChocolateTime;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Double> milk = new ArrayDeque<>();
        Deque<Double> cocoa = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble)
                .collect(Collectors.toList())
                .forEach(milk::offer);
        Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble)
                .collect(Collectors.toList())
                .forEach(cocoa::push);
        Map<Integer, String> receipts = new HashMap<>();
        receipts.put(30, "Milk Chocolate");
        receipts.put(50, "Dark Chocolate");
        receipts.put(100, "Baking Chocolate");
        Map<String, Integer> chocolateMade = new TreeMap<>();


while (!milk.isEmpty() & !cocoa.isEmpty()){
int percentage =(int)( (cocoa.peek()/(cocoa.peek()+milk.peek()))*100);
if(receipts.containsKey(percentage)){
    chocolateMade.putIfAbsent(receipts.get(percentage),0);
    chocolateMade.put(receipts.get(percentage),chocolateMade.get(receipts.get(percentage))+1);
    milk.poll();
    cocoa.pop();
}else {
    cocoa.pop();
    milk.offerLast(milk.poll()+10);
}
}
boolean completed = chocolateMade.values().stream().filter(v->v>=1).count()==3;
if(!completed){
    System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
}else {
    System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
}
        chocolateMade.forEach((k, v)-> System.out.printf(" # %s --> %d%n", k, v));

    }
}

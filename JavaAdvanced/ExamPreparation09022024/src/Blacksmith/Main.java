package Blacksmith;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> steel = new ArrayDeque<>();
        Deque<Integer> carbon = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(steel::offer);
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(carbon::push);
        Map<String, Integer> forgedSwords = new TreeMap<>();
        Map<Integer, String> swords = new HashMap<>();
        swords.put(70, "Gladius");
        swords.put(80, "Shamshir");
        swords.put(90, "Katana");
        swords.put(110, "Sabre");
        while (!steel.isEmpty() & !carbon.isEmpty()){
            int composite;
            composite=steel.peek()+carbon.peek();
            if(swords.containsKey(composite)){
                forgedSwords.putIfAbsent(swords.get(composite), 0);
                forgedSwords.put(swords.get(composite), forgedSwords.get(swords.get(composite))+1);
                steel.poll();
                carbon.pop();
            }else {
                steel.poll();
                carbon.push(carbon.pop()+5);
            }

        }
        int forgedSum=forgedSwords.values().stream().mapToInt(e->e).sum();
        if(forgedSum>0){
            System.out.printf("You have forged %d swords.%n", forgedSum);
        }else {
            System.out.println("You did not have enough resources to forge a sword.");
        }
        print("Steel", steel);
        print("Carbon", carbon);
        forgedSwords.entrySet().stream().filter(e->e.getValue()>0).forEach(e-> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));



    }
    public static void print(String material, Deque<Integer> collection){
        if(!collection.isEmpty()) {
            System.out.print(material + " left: ");
            for (int i = 0; i < collection.size(); i++) {
                if (i != collection.size() - 1) {
                    System.out.print(collection.stream().collect(Collectors.toList()).get(i) + ", ");
                } else {
                    System.out.print(collection.stream().collect(Collectors.toList()).get(i));
                }
            }
            System.out.println();
        }else{
            System.out.println(material+" left: none");
        }
    }
}

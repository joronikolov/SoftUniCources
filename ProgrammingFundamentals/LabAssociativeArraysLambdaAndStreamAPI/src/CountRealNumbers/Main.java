package CountRealNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        Map<String, Integer> catalog= new TreeMap<>();

        for (String string: input
             ) {
            if(catalog.containsKey(string)){
                catalog.put(string, catalog.get(string)+1);
            }else{
                catalog.put(string,1);
            }
        }
        catalog.forEach((e, b)->System.out.printf("%s -> %d%n", e, b));


    }
}

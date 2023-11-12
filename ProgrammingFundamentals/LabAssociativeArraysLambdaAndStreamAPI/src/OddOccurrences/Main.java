package OddOccurrences;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = Arrays.stream(scan.nextLine().split(" ")).map(String::toLowerCase).toArray(String[]::new);

        Map<String, Integer> catalog= new LinkedHashMap<>();

        for (String string: input
        ) {
            if(catalog.containsKey(string)){
                catalog.put(string, catalog.get(string)+1);
            }else{
                catalog.put(string,1);
            }
        }
        String[] result = catalog.entrySet().stream().filter((k) -> k.getValue()%2!=0).map(Map.Entry::getKey).toArray(String[]::new);
        System.out.println(String.join(", ", result));


    }
}

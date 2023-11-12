package WordSynonyms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<String>> container = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            if(container.containsKey(word)){
                container.get(word).add(synonym);
            }else {
                container.put(word, new ArrayList<>());
                container.get(word).add(synonym);
            }

        }
        container.forEach((w, s) -> System.out.printf("%s - %s%n", w, String.join(", ", s)));

    }
}

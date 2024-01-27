import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Set<String>> players = new LinkedHashMap<>();
        Map<String, Integer> cards = new LinkedHashMap<>();
        cards.put("J", 11);
        cards.put("Q", 12);
        cards.put("K", 13);
        cards.put("A", 14);
        cards.put("S", 4);
        cards.put("H", 3);
        cards.put("D", 2);
        cards.put("C", 1);
        String command = scan.nextLine();
        while(!"JOKER".equals(command)){
            String[] comm=command.split(": ");
            players.putIfAbsent(comm[0], new HashSet<>());
            players.get(comm[0]).addAll(Arrays.stream(comm[1].split(",\\s")).collect(Collectors.toList()));
            command = scan.nextLine();

        }
        players.forEach((k,v)->{
            int sum=0;
            for(String s : v){
                String[] c = new String[]{s.substring(0,s.length()-1), s.substring(s.length()-1)};
                if(cards.containsKey(c[0])){
                    sum+=cards.get(c[0])*cards.get(c[1]);
                }else {
                 //   System.out.printf("c0: %s%n",c[0]);
                    sum+=Integer.parseInt(c[0])*cards.get(c[1]);
                }
            }
            System.out.printf("%s: %d%n", k, sum);
        });
    }
}

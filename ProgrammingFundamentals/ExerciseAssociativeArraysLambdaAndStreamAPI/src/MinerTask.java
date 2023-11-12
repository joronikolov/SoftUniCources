import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command=scan.nextLine();
        Map<String, Long> collection = new LinkedHashMap<>();
        int n = 1;
        while(!command.equals("stop")){
                if(collection.containsKey(command)) {
                    collection.put(command, Long.parseLong(scan.nextLine())+collection.get(command));
                }else {
                    collection.put(command, Long.parseLong(scan.nextLine()));
                }

            n+=1;
            command=scan.nextLine();
        }
        collection.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));

    }
}

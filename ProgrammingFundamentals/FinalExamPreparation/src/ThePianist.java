import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, String[]> catalog = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] info = scan.nextLine().split("\\|");
            addPiece(catalog, info[0], info[1], info[2]);
        }
        String[] command = scan.nextLine().split("\\|");
        while(!command[0].equals("Stop")){
            switch (command[0]){
                case "Add":
                    if(catalog.containsKey(command[1])){
                        System.out.printf("%s is already in the collection!%n", command[1]);

                    }else {
                        addPiece(catalog, command[1], command[2], command[3]);
                        System.out.printf("%s by %s in %s added to the collection!%n", command[1], command[2], command[3]);
                    }
                    break;
                case "Remove":
                    if(catalog.containsKey(command[1])){
                        catalog.remove(command[1]);
                        System.out.printf("Successfully removed %s!%n", command[1]);

                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    }
                    break;
                case "ChangeKey":
                    if(catalog.containsKey(command[1])){
                        catalog.get(command[1])[1]=command[2];
                        System.out.printf("Changed the key of %s to %s!%n", command[1], command[2]);

                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", command[1]);
                    }
                    break;

            }
        command=scan.nextLine().split("\\|");
        }
//        catalog.entrySet().stream().
//                sorted(Comparator.comparing((Map.Entry<String, String[]> e) -> e.getKey()).thenComparing(e -> e.getValue()[0])).forEach(e-> System.out.printf("%s -> Composer: %s, Key: %s%n", e.getKey(), e.getValue()[0], e.getValue()[1]));

        catalog.forEach((k, v)-> System.out.printf("%s -> Composer: %s, Key: %s%n", k, v[0], v[1]));
    }
    public static void addPiece(Map<String, String[]> collection, String piece, String composer, String key){
        String[] add = {composer, key};
        collection.put(piece, add);
    }
}

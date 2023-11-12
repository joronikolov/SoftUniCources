import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<String>> reservations = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!command.equals("end")){
            String[] commands = command.split(" : ");
            if(reservations.containsKey(commands[0])){
               reservations.get(commands[0]).add(commands[1]);
            }else
            {
                reservations.put(commands[0], new ArrayList<>());
                reservations.get(commands[0]).add(commands[1]);
            }
            command = scan.nextLine();
        }
        reservations.forEach((k, v) -> {
            System.out.printf("%s: %d%n", k, v.size());
            v.forEach(e-> System.out.printf("-- %s%n", e));
        });
    }
}

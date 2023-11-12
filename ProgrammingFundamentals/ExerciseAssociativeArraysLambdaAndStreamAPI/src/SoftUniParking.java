import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> reservations = new LinkedHashMap<>();
        for(int i =0; i < n; i++){
            String[] commands = scan.nextLine().split(" ");
            switch (commands[0]){
                case "register":
                    if(reservations.containsKey(commands[1])){
                    System.out.printf("ERROR: already registered with plate number %s%n", reservations.get(commands[1]));
                    }else
                {
                    reservations.put(commands[1], commands[2]);
                    System.out.printf("%s registered %s successfully%n", commands[1], commands[2]);
                }
                    break;
                case "unregister":
                    if(!reservations.containsKey(commands[1])){
                        System.out.printf("ERROR: user %s not found%n", commands[1]);
                    }else{
                        reservations.remove(commands[1]);
                        System.out.printf("%s unregistered successfully%n", commands[1]);
                    }
                    break;
            }

        }
        reservations.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}

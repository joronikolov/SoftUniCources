
import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> forceSides = new LinkedHashMap<>();
        Map<String, String> forceUsers = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!command.equals("Lumpawaroo")){
            String[] commands ;
            if(command.contains("|")){
                commands=command.split(" \\| ");
                if(!forceUsers.containsKey(commands[1])){
                    addUser(commands[1], commands[0], forceUsers, forceSides);
                }
            } else if (command.contains("->")) {
                commands= command.split(" -> ");
                addUser(commands[0], commands[1], forceUsers, forceSides);
                System.out.printf("%s joins the %s side!%n", commands[0], commands[1]);
            }
            command=scan.nextLine();
        }
        forceSides.entrySet().stream().filter(e-> !e.getValue().isEmpty()).forEach(e->{
            System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
            e.getValue().forEach(v-> System.out.printf("! %s%n", v));
        });


    }
    public static void addUser(String user, String side, Map<String, String> userMap, Map<String, List<String>> sideMap ){
        String oldSide= "";
        if(userMap.containsKey(user) && !userMap.get(user).equals(side)){
            oldSide = userMap.get(user);
        }

            userMap.put(user, side);
            if (sideMap.containsKey(side)){
                if(!sideMap.get(side).contains(user)){
                    sideMap.get(side).add(user);
                    }
            }else {
                sideMap.put(side, new ArrayList<>());
                sideMap.get(side).add(user);
            }
        if(!oldSide.isEmpty()){
            sideMap.get(oldSide).remove(user);
        }

    }
}


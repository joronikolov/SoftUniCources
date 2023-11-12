import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> reservations = new LinkedHashMap<>();
        reservations.put("shards", "Shadowmourne");
        reservations.put("fragments", "Valanyr");
        reservations.put("motes", "Dragonwrath");
        Map<String, Integer> obtained = new LinkedHashMap<>();
        boolean cycle = true;
        String name="";
        while(cycle){
            String[] commands = Arrays.stream(scan.nextLine().split(" ")).map(String::toLowerCase).toArray(String[]::new);
            for(int i = 1; i < commands.length; i+=2) {

                if (obtained.containsKey(commands[i])) {
                    obtained.put(commands[i], obtained.get(commands[i]) + Integer.parseInt(commands[i - 1]));
                } else {
                    obtained.put(commands[i], Integer.parseInt(commands[i - 1]));

                }
                if(reservations.containsKey(commands[i]) && obtained.get(commands[i])>=250 && name.isEmpty()){
                    name = commands[i];
                    cycle=false;
                    System.out.printf("%s obtained!%n", reservations.get(name));
                    obtained.put(name, obtained.get(name)-250);
                    reservations.forEach((k, v)-> System.out.printf("%s: %d%n", k, obtained.getOrDefault(k, 0)));
                    obtained.entrySet().stream().filter(e->!reservations.containsKey(e.getKey()))
                            .forEach((k)-> System.out.printf("%s: %d%n", k.getKey(), k.getValue()));
                    break;
                }
            }


        }

    }
}

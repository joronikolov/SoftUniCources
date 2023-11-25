import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String separator = "\\|\\|";
        String[] command = scan.nextLine().split(separator);
        Map<String, Integer[]> cities = new LinkedHashMap<>();
        while(!command[0].equals("Sail")){
            if(cities.containsKey(command[0])){
                cities.get(command[0])[0]+=Integer.parseInt(command[1]);
                cities.get(command[0])[1]+=Integer.parseInt(command[2]);
            }else {
                cities.put(command[0], new Integer[]{Integer.parseInt(command[1]), Integer.parseInt(command[2])});
            }

            command = scan.nextLine().split(separator);
        }
        separator="=>";
        command = scan.nextLine().split(separator);
        while(!command[0].equals("End")){
            switch (command[0]){
                case "Plunder":
                    System.out.printf("%s plundered! %s gold stolen, %s citizens killed.%n", command[1],
                            command[3], command[2]);
                    cities.get(command[1])[0]-=Integer.parseInt(command[2]);
                    cities.get(command[1])[1]-=Integer.parseInt(command[3]);
                    if(cities.get(command[1])[0]<=0 || cities.get(command[1])[1]<=0){
                        cities.remove(command[1]);
                        System.out.printf("%s has been wiped off the map!%n", command[1]);
                    }
                    break;
                case "Prosper":
                    if(Integer.parseInt(command[2])<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        cities.get(command[1])[1]+=Integer.parseInt(command[2]);
                        System.out.printf("%s gold added to the city treasury. %s now has %d gold.%n",
                                command[2], command[1], cities.get(command[1])[1]);
                    }
                    break;
            }

            command = scan.nextLine().split(separator);
        }
        if(cities.size()>0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",cities.size());
            cities.forEach((k, v )-> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", k, v[0], v[1]));
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}

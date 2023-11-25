import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destinations = scan.nextLine();
        String command = scan.nextLine();

        while (!command.equals("Travel")){
            String[] commandArray = command.split(":");
            switch (commandArray[0]){
                case "Add Stop":
                    if(Integer.parseInt(commandArray[1])<=destinations.length()-1 && Integer.parseInt(commandArray[1])>=0){
                        StringBuilder buffer = new StringBuilder();
                        for (int i = 0; i < Integer.parseInt(commandArray[1]); i++) {
                            buffer.append(destinations.charAt(i));
                        }
                        for (char c: commandArray[2].toCharArray()
                             ) {
                            buffer.append(c);
                        }
                        for (int i = Integer.parseInt(commandArray[1]); i < destinations.length(); i++) {
                            buffer.append(destinations.charAt(i));
                        }
                        destinations = buffer.toString();
                    }
                    break;
                case "Remove Stop":
                    if(Integer.parseInt(commandArray[1])<=destinations.length()-1 && Integer.parseInt(commandArray[1])>=0
                    && Integer.parseInt(commandArray[2])<=destinations.length()-1 && Integer.parseInt(commandArray[2])>=0){
                        destinations=destinations.substring(0, Integer.parseInt(commandArray[1]))+
                                destinations.substring(Integer.parseInt(commandArray[2])+1);
                    }

                    break;
                case "Switch":
                    destinations=destinations.replaceAll(commandArray[1], commandArray[2]);
                    break;

            }
            System.out.println(destinations);
            command=scan.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", destinations);

    }
}

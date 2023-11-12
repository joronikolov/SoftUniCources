
import java.util.*;
import java.util.stream.Stream;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> submissions = new LinkedHashMap<>();
        List<String> banned = new ArrayList<>();
        String command = scan.nextLine();
        while (!command.equals("exam finished")) {
            String[] commands = command.split("-");
            if(commands.length<3 && !banned.contains(commands[0])){
                banned.add(commands[0]);
            }else {
                int newValue=Integer.parseInt(commands[2]);
                if(submissions.containsKey(commands[0])){

                    if(submissions.get(commands[0]).containsKey(commands[1])) {
                        newValue+=submissions.get(commands[0]).get(commands[1]);
                    }
                    Map<String, Integer> newMap = submissions.get(commands[0]);
                    newMap.put(commands[1], newValue);
                    submissions.put(commands[0], newMap);
                }else{
                    submissions.put(commands[0], new LinkedHashMap<>());
                    Map<String, Integer> newMap = submissions.get(commands[0]);
                    newMap.put(commands[1], newValue);
                    submissions.put(commands[0], newMap);
                    }
            }
            command = scan.nextLine();


        }
        System.out.println("Results:");
        submissions.forEach((s ,m)->{
            if(!banned.contains(s)){
                System.out.printf("%s | %d%n", s, m.values().stream().mapToInt(Integer::intValue).sum());
            }
        });
        System.out.println("Submissions:");
        submissions.values().stream().map((s, i)->
                        System.out.printf("%s - %d%n", s, )
                )

    }
}


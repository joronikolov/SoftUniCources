import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<String> schedule = new ArrayList<>(Arrays.asList(scan.nextLine().split(", ")));
        String command = scan.nextLine();

        while (!command.equals("course start")){

        }






    }
public static List<String> processCommand(List<String> list, String command){
        List<String> current= new ArrayList<>(List.copyOf(list));
        String[] comArr = command.split(":");

        switch(comArr[0]){
            case "Add":
                if(!current.contains(comArr[1])){
                    current.add(comArr[1]);
                }
                break;
            case "Insert":
                
                break;
        }
        return current;

}

}

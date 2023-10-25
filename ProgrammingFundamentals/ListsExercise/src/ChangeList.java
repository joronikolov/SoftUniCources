import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        String command = scan.nextLine();
        while(!command.equals("end")){
            list=processCommand(command,list);
            command = scan.nextLine();
        }
        for (int e: list
             ) {
            System.out.printf("%d ", e);
        }

    }
    public static List<Integer> processCommand(String instructions, List<Integer> list){
        String[] instructionsArr = instructions.split(" ");
        List<Integer> current = new ArrayList<>(List.copyOf(list));
        if(instructionsArr[0].equals("Delete")){
            list.forEach(e->{
                if(Integer.parseInt(instructionsArr[1])==e){
                    current.remove(e);
                }
            }
            );
        }else if(instructionsArr[0].equals("Insert")){
            current.add(Integer.parseInt(instructionsArr[2]), Integer.parseInt(instructionsArr[1]) );
        }
return current;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        String command = scan.nextLine();
        while(!command.equals("End")){
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
        switch(instructionsArr[0]){
            case "Add":
                current.add(Integer.valueOf(instructionsArr[1]));
                break;
            case "Insert":
                if(!checkIndex(Integer.parseInt(instructionsArr[2]), current)){
                break;
                }
                current.add(Integer.parseInt(instructionsArr[2]), Integer.valueOf(instructionsArr[1]));
                break;
            case "Remove":
                if(!checkIndex(Integer.parseInt(instructionsArr[1]), current)){
                break;
                }
                current.remove(Integer.parseInt(instructionsArr[1]));
                break;
            case "Shift":
                   switch (instructionsArr[1]){

                    case "left":
                        for (int i = 0; i < Integer.parseInt(instructionsArr[2]); i++) {
                            current.add(current.get(0));
                            current.remove(0);
                        }

                        break;
                    case "right":
                        for (int i = 0; i < Integer.parseInt(instructionsArr[2]); i++) {
                            current.add(0, current.get(current.size()-1));
                            current.remove(current.size()-1);
                        }

                        break;
                }

                break;
        }
return current;
    }
    public static boolean checkIndex(int index, List<Integer> list){
        if(index<0 || index>list.size()-1){
            System.out.println("Invalid index");
            return false;
        }
        return  true;
    }
}

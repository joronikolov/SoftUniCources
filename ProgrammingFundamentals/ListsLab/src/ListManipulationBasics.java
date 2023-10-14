import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList1 = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
        String command = scan.nextLine();
        while(!command.equals("end")){
            processCommand(command.split(" "), inputList1);
            command = scan.nextLine();
        }


        for(int e : inputList1){
            System.out.print( new DecimalFormat("0.#").format(e) +" ");
        }
        System.out.println();



    }
    public static void processCommand(String[] input, List<Integer> list){
        switch (input[0]){
            case "Add":
                list.add(Integer.parseInt(input[1]));
                break;
            case "Remove":
                list.remove(list.get(list.indexOf(Integer.parseInt(input[1]))));
                break;
            case "RemoveAt":
                list.remove(Integer.parseInt(input[1]));
                break;
            case "Insert":
                list.add(Integer.parseInt(input[2]) ,Integer.parseInt(input[1]));
                break;


        }
    }
}

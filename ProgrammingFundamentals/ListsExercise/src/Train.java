import java.util.*;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        while(!command.equals("end")){
wagons=processPassenger(command,wagons,maxCapacity);
            command = scan.nextLine();
        }
        for (int e : wagons
             ) {
            System.out.printf("%d ", e);
        }

    }
    public static List<Integer> processPassenger(String instructions, List<Integer> list, int capacity){
        String[] instructionsArr = instructions.split(" ");
        List<Integer> current = new ArrayList<>(List.copyOf(list));
        if(instructionsArr[0].equals("Add")){
            current.add(Integer.parseInt(instructionsArr[1]));
        }else {
            int newPassengers = Integer.parseInt(instructionsArr[0]);
            for (int e : current
                 ) {
                    if(capacity-e>=newPassengers) {
                        current.set(list.indexOf(e), e + newPassengers);
                        newPassengers = 0;
                        break;
                    }

            }
        }
        return  current;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while(!command.equals("end")){
           ArrayList<String> res = new ArrayList<>(Arrays.asList(command.split("")));
           List<String> result = new ArrayList<>();
           res.forEach(e->result.add(0, e));
            System.out.println(String.join("", res)+" = "+String.join("", result));
command=scan.nextLine();


        }

    }
}

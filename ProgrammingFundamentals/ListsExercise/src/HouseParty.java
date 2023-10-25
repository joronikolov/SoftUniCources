import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i<n; i++){
            String command = scan.nextLine();
            String[] comArr = command.split(" ");
            if(command.contains("is going")){

                if(list.contains(comArr[0])){
                    System.out.printf("%s is already in the list!%n", comArr[0]);
                }else{
                    list.add(comArr[0]);
                }
            }else{
                if(!list.contains(comArr[0])){
                    System.out.printf("%s is not in the list!%n", comArr[0]);
                }else{
                    list.remove(comArr[0]);
                }
            }
        }
        for (String e: list
             ) {
            System.out.printf("%s%n", e);
        }

    }
}

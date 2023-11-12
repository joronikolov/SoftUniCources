import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split(" ");
        List<String> inputList = new ArrayList<>(Arrays.asList(command));
        inputList.forEach(s->{
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s);

            }
                }
        );





    }
}

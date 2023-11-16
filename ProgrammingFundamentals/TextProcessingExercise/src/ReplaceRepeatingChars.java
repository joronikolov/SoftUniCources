import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());
        String lastInserted="";
        List<String> result = new LinkedList<>();
        boolean insert;
        for (String s : input) {
            insert = !s.equals(lastInserted);
            if (insert) {
                result.add(s);
                lastInserted = s;
            }


        }
        System.out.println(String.join("", result));

    }
}

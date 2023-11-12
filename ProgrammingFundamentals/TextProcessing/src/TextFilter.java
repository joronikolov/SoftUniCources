import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] banned = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for(int i = 0; i < banned.length; i++){
           text =text.replaceAll(banned[i], "*".repeat(banned[i].length())) ;
        }
        System.out.println(text);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(cntVowels(input));

    }
public static int cntVowels(String input){
        int cnt = 0;
        List<String> vowels = new ArrayList<>(Arrays.asList("a", "o", "u", "e", "i")) ;
    for (String s : input.split("")) {
        if(vowels.contains(s.toLowerCase())){
            cnt++;
        }
    }
    return  cnt;
}
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> result = new LinkedList<>(List.of(scan.nextLine().split("\\s+")));
        BiPredicate<String, String[]> match = (input, pattern)->{
            boolean res= false;
            switch(pattern[1]){
                case "Length":
                    if (input.length()==Integer.parseInt(pattern[2])){
                    res=true;
                }
                    break;
                case "StartsWith":
                    Pattern pat = Pattern.compile("^"+pattern[2]+".*");
                    Matcher matcher = pat.matcher(input);
                    if(matcher.find()){
                        res=true;
                    }

                    break;
                case "EndsWith":
                    Pattern pat1 = Pattern.compile(".*"+pattern[2]+"$");
                    Matcher matcher1 = pat1.matcher(input);
                    if(matcher1.find()){
                        res=true;
                    }
                    break;
            }
        return res;
        };
String[] command = scan.nextLine().split("\\s");
    while(!"Party!".equals(command[0])){
        List<String> buffer = new LinkedList<>(result);
        result.clear();
        switch(command[0]){
            case "Double":
                for (String s : buffer) {
                    result.add(s);
                    if(match.test(s, command)){
                        result.add(s);
                    }

                }
                break;
            case "Remove":
                for (String s : buffer) {
                if(!match.test(s, command)){
                    result.add(s);
                }

            }
                break;

        }
        command = scan.nextLine().split("\\s");

    }
    if(result.isEmpty()){
        System.out.println("Nobody is going to the party!");
    }else{
        for(int i =0; i<result.size(); i++){
            System.out.printf("%s"+((i<result.size()-1)?", ":" "+"are going to the party!"), result.get(i));
        }
    }
    }
}

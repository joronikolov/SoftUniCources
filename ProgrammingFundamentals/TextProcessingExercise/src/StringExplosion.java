import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());
        int skip=0;
        boolean readPower = false;
        boolean delete = false;
        List<String> result = new LinkedList<>();
        for (int i = 0; i < input.size(); i++) {
            if(input.get(i).equals(">")){
                delete=true;
                readPower=true;
                result.add(input.get(i));
                continue;
            }
            if(readPower){
                skip += Integer.parseInt(input.get(i));
                readPower=false;
            }
            if(!delete && skip==0){
                result.add(input.get(i));
            }else {
                skip--;
            }
            if(skip==0){
                delete=false;
            }



        }
        System.out.println(String.join("", result));
    }
}

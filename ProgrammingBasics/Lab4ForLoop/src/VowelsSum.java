import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("E",2);
        map.put("I",3);
        map.put("O",4);
        map.put("U",5);
        int res=0;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for(int i=0; i<text.length(); i++){
            String symb=String.valueOf(text.charAt(i)).toUpperCase();
            if(map.containsKey(symb)){
                res+=map.get(symb);
            }
        }
        System.out.println(res);

    }



}

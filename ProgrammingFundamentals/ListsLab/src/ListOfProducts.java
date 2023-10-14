import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String current = scan.nextLine();
            boolean added = false;
            if (i==0){
                list.add(current);
                added=true;
            }else {
                for (int e=0 ; e<list.size(); e++) {
                    if (current.compareTo(list.get(e)) < 0) {
                        list.add(e, current);
                        added=true;
                        break;
                    }
                }
            }
            if(!added){
                list.add(current);
            }
        }
        for (String e : list){
            System.out.printf("%d.%s%n", list.indexOf(e)+1, e);
        }
    }

}

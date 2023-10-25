import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        List<String> list = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList()));
        int size = list.size();
        List<String> dest = new ArrayList<>();
        while(dest.size()<size){
            Random rand = new Random();
            int index = rand.nextInt(list.size());
            if(index<list.size()) {
                dest.add(list.get(index));
                list.remove(index);
            }
        }
        dest.forEach(System.out::println);

    }
}

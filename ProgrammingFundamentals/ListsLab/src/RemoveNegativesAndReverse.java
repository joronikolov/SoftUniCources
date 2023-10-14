import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList1 = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
        if(processList(inputList1).isEmpty()){
            System.out.println("empty");
        }else {
            for (int e : processList(inputList1)
            ) {
                System.out.printf("%d ", e);
            }
        }
    }
    public static List<Integer> processList( List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (int e : list
             ) {
            if(e>0){
                result.add(e);
            }
        }
        Collections.reverse(result);
        return result;
    }
}

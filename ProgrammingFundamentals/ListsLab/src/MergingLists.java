import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList1 = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
        List<Integer> inputList2 = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
        List<Integer> res = new ArrayList<>();

        for(int i=0 ; i<Math.max(inputList1.size(), inputList2.size()); i++){
            if(i<inputList1.size()){
                res.add(inputList1.get(i));
            }
            if(i<inputList2.size()){
                res.add(inputList2.get(i));
            }
        }
        for(int e : res){
            System.out.print( new DecimalFormat("0.#").format(e) +" ");
        }
        System.out.println();



    }
}

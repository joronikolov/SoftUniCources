import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
        List<Integer> res = new ArrayList<>();

        for(int i=0 ; i<inputList.size(); i++){
            if(i<inputList.size()-1-i){
                res.add(i, inputList.get(i)+ inputList.get(inputList.size()-1-i));
            }else if(i==inputList.size()-1-i){
                res.add(i, inputList.get(i));
                break;
            }else {
                break;
            }
        }
        for(int e : res){
            System.out.print( new DecimalFormat("0.#").format(e) +" ");
        }
        System.out.println();



    }
}

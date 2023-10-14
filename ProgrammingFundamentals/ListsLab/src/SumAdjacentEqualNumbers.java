import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> inputList = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Double::valueOf).collect(Collectors.toList()));
        for(int i=0 ; i<inputList.size(); i++){
            if(i!=inputList.size()-1 && inputList.get(i).equals(inputList.get(i+1))){
                inputList.set(i, inputList.get(i)+inputList.get(i+1));
                inputList.remove(i+1);
                i=-1;
            }
        }
        for(double e : inputList){
            System.out.print( new DecimalFormat("0.#").format(e) +" ");
        }
        System.out.println();



    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> bomb = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        for(int i =0 ; i< list.size(); i++){
            list=processBomb(list,bomb);
        }
        int sum =0 ;
        for (int e: list
             ) {
            sum+=e;

        }
        System.out.println(sum);


    }
public static List<Integer> processBomb(List<Integer> list, List<Integer> bomb){
        List<Integer> current= new ArrayList<>(List.copyOf(list));
    if(current.contains(bomb.get(0))){
        List<Integer> removeList=new ArrayList<>(Arrays.asList(Integer.MIN_VALUE));
        //in minIndex=
        for (int i = list.indexOf(bomb.get(0))-bomb.get(1); i <= list.indexOf(bomb.get(0))+bomb.get(1); i++) {
            if(i>=0 && i<list.size()){
            current.set(i, Integer.MIN_VALUE);

            }
        }
        current.removeAll(removeList);
    }
    return current;
}
}

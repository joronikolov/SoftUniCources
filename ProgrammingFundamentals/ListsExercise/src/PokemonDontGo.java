import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int sum=0;
        while(!list.isEmpty()){
            int curIndex=Integer.parseInt(scan.nextLine());
            list=processIndex(list,curIndex);
            sum+= list.get(list.size()-1);
            list.remove(list.size()-1);

        }


        System.out.println(sum);


    }
public static List<Integer> processIndex(List<Integer> list, int index){
        List<Integer> current= new ArrayList<>(List.copyOf(list));
    int deletedNumber;
    if(index<0){
        deletedNumber=current.get(0);
        current.set(0, current.get(current.size()-1));
        //current.remove(current.size()-1);
        current=method(current, deletedNumber);
    }else
    if(index>current.size()-1){
        deletedNumber= current.get(current.size()-1);
        current.set(current.size()-1, current.get(0));
        //current.remove(0);
        current=method(current, deletedNumber);
    }else {
        deletedNumber=list.get(index);
        current.remove(index);
        current=method(current, deletedNumber);
    }
    current.add(deletedNumber);
    return current;
}
public static List<Integer> method(List<Integer> list, int deletedNumber){
        List<Integer> current = new ArrayList<>(List.copyOf(list));

    for (int i = 0 ; i<current.size(); i++) {
        if(current.get(i)<=deletedNumber){
            current.set(i, current.get(i)+deletedNumber);
        }else if(current.get(i)>deletedNumber){
            current.set(i, current.get(i)-deletedNumber);
        }
    }
    return current;
}
}

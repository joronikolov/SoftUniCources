import java.util.*;
import java.util.stream.Collectors;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int daysDying=0;
        List<Integer> plants = new LinkedList<>();
        List<Integer> plantsContainer = new LinkedList<>();
        plants=Arrays.stream(scan.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());

        boolean stopLoop =false;
        for (int i = 0; i < n; i++) {
            plantsContainer.add(plants.get(0));

        for(int j = 1;  j<plants.size(); j++){
            if (plants.get(j)<=plants.get(j-1)){
                plantsContainer.add(plants.get(j));

            }
        }
        if(plants.size()>plantsContainer.size()){
            daysDying+=1;
            plants= List.copyOf(plantsContainer);
            plantsContainer.clear();
        }else {
            stopLoop=true;
        }
        if(stopLoop){
            break;
        }
        }
        System.out.println(daysDying);
    }
}

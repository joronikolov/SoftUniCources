import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> animalsAreas = new LinkedHashMap();
        Map<String, Integer> animalsFood = new LinkedHashMap();
        String[] command = scan.nextLine().split(" ");
        while (!command[0].equals("EndDay")){
            String animalName = command[1].split("-")[0];
            int neededFood = Integer.parseInt(command[1].split("-")[1]);
            switch (command[0]){
                case "Add:":
                    String area = command[1].split("-")[2];

                    if(animalsAreas.containsKey(animalName)){
                        animalsFood.put(animalName, animalsFood.get(animalName)+neededFood);
                    }
                    else {
                        animalsFood.put(animalName, neededFood);
                        animalsAreas.put(animalName, area);
                    }

                    break;
                case "Feed:":
                    if(animalsAreas.containsKey(animalName)){
                        animalsFood.put(animalName, animalsFood.get(animalName)-neededFood);
                        if(animalsFood.get(animalName)<=0){
                            animalsFood.remove(animalName);
                            animalsAreas.remove(animalName);
                            System.out.printf("%s was successfully fed%n", animalName);
                        }
                    }
                    break;
            }

            command = scan.nextLine().split(" ");
        }
        System.out.println("Animals:");
        animalsFood.forEach((k, v)-> System.out.printf(" %s -> %dg%n", k, v));
        System.out.println("Areas with hungry animals:");
        Map<String, Integer> areasMap = new LinkedHashMap();
        for(String s : animalsAreas.values()){
            if (areasMap.containsKey(s)){
                areasMap.put(s, areasMap.get(s)+1);
            }else {
                areasMap.put(s, 1);
            }

        }
        areasMap.forEach((k,v)-> System.out.printf(" %s: %d%n", k, v));



    }
}

import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String , Map<String, Long>> population = new LinkedHashMap<>();
        Map<String, Long> countries = new TreeMap<>();
        while(!"report".equals(command)){
            String[] array = command.split("\\|");
            population.putIfAbsent(array[1], new LinkedHashMap<>());
            population.get(array[1]).put(array[0], Long.parseLong(array[2]));
            command = scan.nextLine();
        }
        population.forEach((k,v)->{
            long countrySum=0;
            for (String s: v.keySet()){
                countrySum+=v.get(s);
            }
            countries.put(k, countrySum);

            });
        countries.entrySet().stream().sorted((a,b)-> b.getValue().compareTo(a.getValue()))
                .forEach((countryName)-> {
                    System.out.printf("%s (total population: %d)%n", (Object) countryName.getKey(), countryName.getValue());
                    population.get(countryName.getKey()).entrySet().stream().sorted((a,b)-> b.getValue().compareTo(a.getValue()))
                            .forEach(e->System.out.printf("=>%s: %d%n", e.getKey(), e.getValue()));


                });


    }
}

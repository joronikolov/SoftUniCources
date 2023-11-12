import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, ArrayList<Double>> reservations = new LinkedHashMap<>();
        for(int i =0; i < n; i++){
            String student = scan.nextLine();
            Double grade = Double.parseDouble(scan.nextLine());
            if(reservations.containsKey(student)){
                reservations.get(student).add(grade);
            }else
            {
                reservations.put(student, new ArrayList<>());
                reservations.get(student).add(grade);
            }

        }

        Map<String, Double> result = new LinkedHashMap<>();
        reservations.forEach((k, v) -> {
            result.put(k, v.stream().mapToDouble(a->a).average().orElse(0.0));
        });
        result.entrySet().stream().filter(e->e.getValue()>=4.50).forEach(d-> System.out.printf("%s -> %.2f%n", d.getKey(), d.getValue()));
    }
}

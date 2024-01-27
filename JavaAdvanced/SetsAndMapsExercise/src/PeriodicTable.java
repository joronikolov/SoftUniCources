import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<String> elements = new LinkedHashSet<>();
        for(int i = 0 ; i<n;i++){
            elements.addAll(Arrays.asList(scan.nextLine().split("\\s")));

        }
        elements.stream().sorted().forEach(e->System.out.printf("%s ", e));
    }
}

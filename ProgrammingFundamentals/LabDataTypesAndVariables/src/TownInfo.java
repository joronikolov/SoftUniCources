import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        String population = scan.nextLine();
        String area = scan.nextLine();
        System.out.printf("Town %s has population of %d and area %d square km.", town, Integer.parseInt(population), Integer.parseInt(area));
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstArray = scan.nextLine().split(" ");
        String[] secondArray = scan.nextLine().split(" ");

        for(String first : secondArray){
            for(String second : firstArray){
                if (first.equals(second)){
                    System.out.printf("%s ",first);
                }
            }
        }

    }
}

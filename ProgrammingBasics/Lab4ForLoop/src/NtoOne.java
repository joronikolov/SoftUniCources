import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        for(int i=start; i>=1;i--){
            System.out.println(i);
        }
    }
}

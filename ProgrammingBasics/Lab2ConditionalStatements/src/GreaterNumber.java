import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=scan.nextInt();
        int second=scan.nextInt();
        if(first>=second){
            System.out.println(first);
        }
        else
        {
            System.out.println(second);
        }
    }
}

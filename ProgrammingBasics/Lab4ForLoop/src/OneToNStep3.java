import java.util.Scanner;

public class OneToNStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int end = scan.nextInt();
        for(int i=1; i<=end;i=i+3){
            System.out.println(i);
        }
    }
}

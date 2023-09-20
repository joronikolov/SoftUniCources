import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers=scanner.nextInt();
        int res=0;
        for(int i=1; i<=numbers;i++ ){
res+=scanner.nextInt();
        }
        System.out.println(res);
    }


}

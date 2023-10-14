import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f",factorial(a)*1.0/factorial(b));

    }
    public static long factorial(long a){
        long fac=1;
        for (int i=1 ; i<=a; i++){
            fac*=i;
        }
        return  fac;
    }
}

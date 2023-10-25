import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =Integer.parseInt(scan.nextLine());
        BigInteger fuck = new BigInteger("1");
        for(int i = 1; i<=n; i++){
            fuck=fuck.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(fuck);
    }
}

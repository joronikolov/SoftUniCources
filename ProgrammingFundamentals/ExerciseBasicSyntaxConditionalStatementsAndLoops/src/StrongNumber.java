import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine()) ;
        String numToString = String.valueOf(num);
        int sum=0;
        for(int i =0; i<=numToString.length()-1;i++){
            int cur = Integer.parseInt(String.valueOf(numToString.charAt(i)));
            long fac=1;
            for(int j= 1; j<=cur;j++){
                fac*=j;
            }
//            System.out.printf("fac: %d%n", fac  );
            sum+=fac;
//            System.out.printf("sum: %d%n", sum  );
        }
        if(sum==num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }
}
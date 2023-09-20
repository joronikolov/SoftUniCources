import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers=scanner.nextInt();
        int res=0;
        int res1=0;
        for(int i=1; i<=numbers;i++ ){
            if(i%2==0){
                res+=scanner.nextInt();
            }else {
                res1+=scanner.nextInt();
            }

        }
        if(res==res1) {
            System.out.printf("Yes%nSum = %d", res);
        }else {
            System.out.printf("No%nDiff = %d", Math.abs(res-res1));
        }
    }


}

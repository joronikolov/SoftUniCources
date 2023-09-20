import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers=scan.nextInt();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<numbers;i++){
            int current= scan.nextInt();

            if(current>max){
                max=current;
            }
            sum+=current;
        }
        if (max==sum-max){
                System.out.printf("Yes%nSum = %d",max);
            }else {
                System.out.printf("No%nDiff = %d", Math.abs(sum-max-max));
            }
    }
}

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int sum=0;
        int cnt=0;
        int i=0;
        while(cnt<n){
            if(i%2!=0){
                System.out.println(i);
                sum+=i;
                cnt++;
            }
            i++;
        }
        System.out.printf("Sum: %d",sum);
    }
}


import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] people = new int[n];
        int sum = 0;
        for (int i = 0;i< n;i++){
            int cur = Integer.parseInt(scan.nextLine());
        people[i]=cur;
        sum+=cur;
        }
        for(int e : people){
            System.out.printf("%d ",e);
        }
        System.out.println();
        System.out.println(sum);

    }
}

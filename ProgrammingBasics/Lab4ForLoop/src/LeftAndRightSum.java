import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers=scanner.nextInt();
        int res=0;
        int res1=0;
        for(int i=1; i<=numbers;i++ ){
            res+=scanner.nextInt();
        }
        for(int i=1; i<=numbers;i++ ){
            res1+=scanner.nextInt();
        }
        if(res==res1){
            System.out.println(" Yes, sum = "+res1);
        }else {
            System.out.println(" No, diff = "+Math.abs(res1-res));
        }
    }
}

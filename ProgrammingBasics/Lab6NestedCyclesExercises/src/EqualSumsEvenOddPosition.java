import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        scan.nextLine();
        int end = scan.nextInt();
        scan.nextLine();
        for (int i=start;i<=end; i++){
            int sumOdd=0;
            int sumEven=0;
            for(int j=1;j<=String.valueOf(i).length();j++){
                if(j%2!=0){
                   sumOdd+=(int) String.valueOf(i).charAt(j-1);
                }else {
                    sumEven+=(int) String.valueOf(i).charAt(j-1);
                }
            }
            if(sumOdd==sumEven){
                System.out.printf("%d ", i);
            }
        }
    }
}

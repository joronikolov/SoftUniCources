import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scannedNumber= scan.nextInt();
        scan.nextLine();
        int cnt=1;
        for(int i=1;i<=scannedNumber;i++){
            if (cnt>scannedNumber){
                break;
            }
            for(int j=1; j<=i;j++){

                    System.out.printf("%d ",cnt);
cnt++;
if (cnt>scannedNumber){
    break;
}


            }
            System.out.println();
        }
    }
}

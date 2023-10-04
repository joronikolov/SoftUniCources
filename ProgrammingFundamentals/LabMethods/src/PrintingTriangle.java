import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i=1; i<=number;i++){
            printLine(i);
        }
        for(int i=number-1; i>=1;i--){
            printLine(i);
        }


    }

    private static void printLine(int number) {
       for (int i=1; i<=number; i++){
           System.out.printf("%d ", i);
       }
        System.out.println();
    }
}

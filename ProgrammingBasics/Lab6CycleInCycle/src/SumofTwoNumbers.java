import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        scan.nextLine();
        int end = scan.nextInt();
        scan.nextLine();
        int magical = scan.nextInt();
        scan.nextLine();
        boolean flag=false;
        int combNumber=0;
        for (int i=start; i<=end; i++){
            if (flag==true) {
                break;
            }
            for (int j = start; j <=end ; j++) {

                combNumber++;

                if(i+j==magical){
                    System.out.printf("Combination N:%d (%d + %d = %d)",combNumber,i,j,magical);
                    flag=true;
                    break;
                }

                }
            }
        if(flag!=true){
            System.out.printf("%d combinations - neither equals %d",combNumber,magical);
        }
        }

    }


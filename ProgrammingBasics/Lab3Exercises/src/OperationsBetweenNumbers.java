import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2= scan.nextInt();
        scan.nextLine();
        String operator=scan.nextLine();
        String message="";
        double result=0;
        switch (operator){
            case "+":
                result=n1+n2;
                message=String.format("%d %s %d = %.0f - %s",n1,operator,n2,result,(result%2==0)?"even":"odd" );
                break;
            case "-":
                result=n1-n2;
                message=String.format("%d %s %d = %.0f - %s",n1,operator,n2,result,(result%2==0)?"even":"odd" );
                break;
            case "*":
                result=n1*n2;
                message=String.format("%d %s %d = %.0f - %s",n1,operator,n2,result,(result%2==0)?"even":"odd" );
                break;
            case "/":
                if(n2!=0){
                    result=(double) n1/(double) n2;
                    message=String.format("%d %s %d = %.2f",n1,operator,n2,result );
                }else {
                    message=String.format("Cannot divide %d by zero",n1 );      }
                break;
            case "%":
                if(n2!=0){
                    result=n1% n2;
                    message=String.format("%d %s %d = %.0f",n1,operator,n2,result );
                }else {
                    message=String.format("Cannot divide %d by zero",n1 );      }
                break;
        }
        System.out.println(message);
    }
}

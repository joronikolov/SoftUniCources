import java.util.Scanner;

public class Number100_200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pass = scan.nextInt();
        if(pass<100){
            System.out.println("Less than 100");
        }else if(pass<=200 & pass>=100){
            System.out.println("Between 100 and 200");
        } else if (pass>200) {
            System.out.println("Greater than 200");
            
        }
        else{
            System.out.println("Undefined");
        }
    }
}

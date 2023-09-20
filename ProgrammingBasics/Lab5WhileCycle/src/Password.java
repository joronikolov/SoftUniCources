import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine();
        String enteredPass="";
        while (!pass.equals(enteredPass)){
            enteredPass=scan.nextLine();
            if (enteredPass.equals(pass)){
                System.out.printf("Welcome %s!",user);
            }
        }
    }
}

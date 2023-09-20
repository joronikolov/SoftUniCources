import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        String enteredPass=scan.nextLine();
//        String enteredPass="";
        String password="";
        for(int i = user.length()-1; i>=0;i--){
            password=password+user.charAt(i);
        }
        int tries = 1;
        if(enteredPass.equals(password)){
            System.out.printf("User %s logged in.",user);

        }else {
            while (!enteredPass.equals(password)) {
                tries++;
                System.out.println("Incorrect password. Try again.");
                enteredPass = scan.nextLine();
                if (enteredPass.equals(password)) {
                    System.out.printf("User %s logged in.", user);
                    break;
                }
                if (tries > 3) {
                    System.out.printf("User %s blocked!", user);
                    break;
                }
            }
        }




    }
}
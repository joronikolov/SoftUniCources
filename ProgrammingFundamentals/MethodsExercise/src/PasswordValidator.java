import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        checkPassword(password);

    }
public static void checkPassword(String password){
        boolean count = false;
        boolean digits = false;
        boolean digitsAndLetters =false;
        if(password.length()>=6 & password.length()<=10){
            count=true;
        }
        String tmp = password;
        if(tmp.replaceAll("\\d","").length()<=password.length()-2){
            digits=true;
        }
        tmp = password;
        if(tmp.replaceAll("\\d", "").replaceAll("[a-zA-Z]","").length()==0){
        digitsAndLetters=true;
        }
        if(count==false){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(digitsAndLetters==false){
            System.out.println("Password must consist only of letters and digits");
        }
        if(digits==false){
            System.out.println("Password must have at least 2 digits");
        }
        if(count==true && digits == true && digitsAndLetters==true){
            System.out.println("Password is valid");
        }


}
}

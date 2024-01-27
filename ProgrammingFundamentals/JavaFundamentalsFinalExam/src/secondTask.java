import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class secondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Pattern pattern = Pattern.compile("(^.*)>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<\\1$");
        for (int i = 0; i < n; i++) {
            String password = scan.nextLine();
            Matcher matcher = pattern.matcher(password);
            if(matcher.find() && password.length()>0){
              password=matcher.group(2)+matcher.group(3)+matcher.group(4)+matcher.group(5);
                System.out.printf("Password: %s%n", password);
                }else {
                System.out.println("Try another password!");
            }


        }

    }
}

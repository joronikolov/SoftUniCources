import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile("^_\\.+[A-Z][a-zA-Z0-9]{4,}[A-Z]_\\.+$");
        for(int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            StringBuilder group = new StringBuilder();


                if (matcher.find()) {

                    for (String s : matcher.group().split("")
                    ) {
                        if (s.matches("\\d")) {
                            group.append(s);
                        }
                    }
                    System.out.printf("Group: %s%n", group.length()==0 ? "default" : group.toString());
                }else{
                    System.out.println("Invalid pass!");
                }


        }
    }
}
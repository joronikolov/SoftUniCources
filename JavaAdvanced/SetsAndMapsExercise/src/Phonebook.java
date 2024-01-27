import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        String[] command = scan.nextLine().split("-");
        while(!"search".equals(command[0])){
            phoneBook.put(command[0], command[1]);
            command = scan.nextLine().split("-");
        }
        command = scan.nextLine().split("\\s");
        while(!"stop".equals(command[0])){

            if(phoneBook.containsKey(command[0])){
                System.out.printf("%s -> %s%n", command[0], phoneBook.get(command[0]));
            }else {
                System.out.printf("Contact %s does not exist.%n", command[0]);
            }
            command = scan.nextLine().split("\\s");
        }
    }
}

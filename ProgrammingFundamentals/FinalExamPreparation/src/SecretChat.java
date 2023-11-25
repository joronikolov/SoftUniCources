import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String[] command = scan.nextLine().split(":\\|:");
        StringBuilder sb = new StringBuilder(message);
        while (!command[0].equals("Reveal")){
            switch (command[0]){
                case "InsertSpace":
                    sb.insert(Integer.parseInt(command[1]), " ");
                    System.out.println(sb.toString());
                    break;
                case "Reverse":
                    int ix = sb.indexOf(command[1]);
                    if(ix>=0){
                        sb.delete(ix, ix+command[1].length()+1);
                        int sbLength = sb.length();
                        for (String s : command[1].split("")
                             ) {
                            sb.insert(sbLength, s);

                        }
                        System.out.println(sb.toString());
                    }else{
                        System.out.println("error");

                    }
                    break;
                case "ChangeAll":
                    String replace = sb.toString();
                    replace=replace.replaceAll(command[1], command[2]);
                    sb.delete(0,sb.length());
                    sb.append(replace);
                    System.out.println(sb.toString());
                    break;
            }

            command=scan.nextLine().split(":\\|:");
        }
        System.out.printf("You have a new text message: %s", sb.toString());

    }
}

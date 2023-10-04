import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int repeat = Integer.parseInt(scan.nextLine());
        System.out.println(repeat(string, repeat));




    }

    public static String repeat(String string, int repeat){
        String[] result = new String[repeat];
        for (int i=0; i< repeat; i++){
         result[i]=string;
        }
        return String.join("", result);
    }

}

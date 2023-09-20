import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        word= scan.nextLine();
        while ( !word.equals("Stop")){
            System.out.println(word);
            word=scan.nextLine();
        }
    }
}

import java.util.Scanner;

public class CharacterSequence {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String end = scan.nextLine();
            for(int i=0; i<end.length();i++){
                System.out.println(end.charAt(i));
            }

        }


}

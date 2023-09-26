import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int numberOfLines = Integer.parseInt(scan.nextLine());
        String message ="";
        for (int i = 0; i < numberOfLines; i++) {
            char letter=scan.nextLine().charAt(0);
            message+=(char)(letter+key);
        }
        System.out.println(message);




    }
}

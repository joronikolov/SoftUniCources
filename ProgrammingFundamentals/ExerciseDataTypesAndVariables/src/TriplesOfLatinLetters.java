import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne=Integer.parseInt(scan.nextLine());
        for(int i=0; i<numberOne; i++) {

            for(int j=0; j<numberOne; j++) {

                for(int f=0; f<numberOne; f++) {
                    System.out.printf("%c%c%c%n", (char)(i+97) , (char)(j+97), (char)(f+97));
                }

            }

        }


    }
}

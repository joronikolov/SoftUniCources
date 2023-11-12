import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String forRemove = scan.nextLine();
        String mainText = scan.nextLine();
        int ocurences = mainText.indexOf(forRemove);
        while (ocurences>-1){
            mainText=mainText.substring(0, ocurences)+
                    mainText.substring(ocurences+forRemove.length());
            ocurences = mainText.indexOf(forRemove);
        }
        System.out.println(mainText);





    }
}

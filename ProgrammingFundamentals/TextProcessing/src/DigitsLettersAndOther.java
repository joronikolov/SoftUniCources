import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        StringBuilder digirs = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for( char ch : text.toCharArray()){
            if(Character.isDigit(ch)){
                digirs.append(ch);
            }else if(Character.isAlphabetic(ch)){
                letters.append(ch);
            }else {
                others.append(ch);
            }
        }
        System.out.println(digirs.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());
    }
}

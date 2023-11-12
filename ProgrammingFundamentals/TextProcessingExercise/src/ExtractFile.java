import java.util.Scanner;
import java.util.regex.Pattern;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(Pattern.quote("\\"));
        System.out.printf("File name: %s%n",input[input.length-1].split(Pattern.quote("."))[0]);
        System.out.printf("File extension: %s%n",input[input.length-1].split(Pattern.quote("."))[1]);


    }
}

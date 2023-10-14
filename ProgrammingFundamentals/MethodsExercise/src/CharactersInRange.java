import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        printRange(first, second);


    }
public static void printRange(char one, char two){
        char first;
        char second;

        if(one<two){
            first=one;
            second=two;
        }else {
            first=two;
            second=one;
        }
    for (int i = first+1; i < second; i++) {
        System.out.printf("%c ", i);
    }
}
}

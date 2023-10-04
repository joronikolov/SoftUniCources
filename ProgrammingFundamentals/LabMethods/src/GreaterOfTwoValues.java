import java.text.DecimalFormat;
import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String first = scan.nextLine();
        String second = scan.nextLine();
       switch (type){
           case "int":
               System.out.println(compare(Integer.parseInt(first), Integer.parseInt(second)));
               break;
           case "char":
               System.out.println(compare(first.charAt(0), second.charAt(0)));
               break;
           case "string":
               System.out.println(compare(first, second));
               break;

       }




    }

    public static int compare(int first, int second){
        if(first>second){
            return first;
        }
        return second;
    }
    public static String compare(String first, String second){
        if(first.compareTo(second)>0){
            return first;
        }
        return second;
    }
    public static char compare(char first, char second){
        if(first>second){
            return first;
        }
        return second;
    }

}

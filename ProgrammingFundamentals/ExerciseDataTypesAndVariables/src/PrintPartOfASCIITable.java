import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstIndex=Integer.parseInt(scan.nextLine());
        int lastIndex=Integer.parseInt(scan.nextLine());
        for(int i=firstIndex; i<=lastIndex;i++){
            System.out.printf("%c ",(char)i);
        }

    }
}

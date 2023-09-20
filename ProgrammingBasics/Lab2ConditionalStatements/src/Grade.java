import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if(grade>=5){
            System.out.println("Excellent!");
        }
    }
}

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age = scan.nextDouble();
        scan.nextLine();
        String sex = scan.nextLine();
        if(sex.equals("m")){
            if(age<16){
                System.out.println("Master");
            }else {
                System.out.println("Mr.");
            }
        }
        if(sex.equals("f")){
            if(age<16){
                System.out.println("Miss");
            }else {
                System.out.println("Ms.");
            }
        }
    }
}

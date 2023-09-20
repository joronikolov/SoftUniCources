import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysPassed=1;
        int mettersLeft=8848-5364;
        String command=scan.nextLine();
        while (!command.equals("END")){

if(command.equals("END")||mettersLeft<=0||daysPassed>5){
    break;
} else if (command.equals("Yes")) {
    daysPassed++;
    if(daysPassed>5){
        break;
    }
}
int metters=Integer.parseInt(scan.nextLine());
mettersLeft-= metters;
if(mettersLeft<=0){
    break;
}
command=scan.nextLine();

        }
        if(mettersLeft<=0){
            System.out.printf("Goal reached for %d days!",daysPassed);
        }else {
            System.out.printf("Failed!%n%d", 8848-mettersLeft);
        }
    }
}

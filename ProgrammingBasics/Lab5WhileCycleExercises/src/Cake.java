import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width= scan.nextInt();
        scan.nextLine();
        int length = scan.nextInt();
        scan.nextLine();
        int areaLeft = length*width;
        while(true){
            String command = scan.nextLine();
            if(command.equals("STOP")){
                System.out.printf("%d pieces are left.", areaLeft);
                break;
            }else {
                areaLeft-=Integer.parseInt(command);
                if (areaLeft <= 0) {
                    System.out.printf("No more cake left! You need %d pieces more.",Math.abs(areaLeft));
                    break;
                }
            }
        }
    }
}

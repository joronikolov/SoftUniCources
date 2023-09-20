import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width= scan.nextInt();
        scan.nextLine();
        int length = scan.nextInt();
        scan.nextLine();
        int height = scan.nextInt();
        scan.nextLine();
        int volumeLeft = length*width*height;
        while(true){
            String command = scan.nextLine();
            if(command.equals("Done")){
                System.out.printf("%d Cubic meters left.", volumeLeft);
                break;
            }else {
                volumeLeft-=Integer.parseInt(command);
                if (volumeLeft <= 0) {
                    System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volumeLeft));
                    break;
                }
            }
        }
    }
}

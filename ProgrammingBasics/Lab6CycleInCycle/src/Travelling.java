import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true){
            String dest= scan.nextLine();
            if(dest.equals("End")){
                break;
            }
            double budget= Double.parseDouble(scan.nextLine());

            double saved=0;
            while(true){
                if (saved>=budget){
                    System.out.printf("Going to %s!%n",dest);
                    saved=0;
                    break;
                }

                saved+= Double.parseDouble(scan.nextLine());

            }
        }
    }
}

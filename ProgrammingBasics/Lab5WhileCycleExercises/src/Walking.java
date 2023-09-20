import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        while(true){
            String command= scan.nextLine();
            if(command.equals("Going home")){
                sum+= scan.nextInt();
                if(sum>=10000){
                    System.out.printf("Goal reached! Good job!%n%d steps over the goal!",sum-10000);
                    break;
                }else {
                    System.out.printf("%d more steps to reach goal.", 10000 - sum);
                    break;
                }

            }else{
                sum+=Integer.parseInt(command);

            }
            if(sum>=10000){
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!",sum-10000);
                break;
            }
        }
    }
}

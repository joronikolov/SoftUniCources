import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command;
        double sum=0;
        while(true){
            command= scan.nextLine();
            if(!command.equals("NoMoreMoney")){
                if(Double.parseDouble(command)>=0) {
                    System.out.printf("Increase: %.2f%n",Double.parseDouble(command));
                    sum += Double.parseDouble(command);
                }else {
                    System.out.println("Invalid operation!");
                    System.out.printf("Total: %.2f", sum);
                    break;
                }
            } else if (command.equals("NoMoreMoney")) {
                System.out.printf("Total: %.2f", sum);
                break;
            }
        }
    }
}

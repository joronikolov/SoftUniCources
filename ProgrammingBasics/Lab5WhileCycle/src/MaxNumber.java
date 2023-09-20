import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        while(true){
            String command=scan.nextLine();
            if(command.equals("Stop")){
                break;
            }else {
                if(Integer.parseInt(command)<min){
                    min=Integer.parseInt(command);
                }
                if(Integer.parseInt(command)>max){
                    max=Integer.parseInt(command);
                }
            }
        }
        System.out.println(max);
    }
}

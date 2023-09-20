import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input=Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= input; i++) {
            int sum=0;
            for(int j=0;j<String.valueOf(i).length();j++){
                sum+=Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)));
            }
            if(sum==5 || sum==7 || sum==11){
                System.out.printf("%d -> %s%n", i, "True");
            }else {
                System.out.printf("%d -> %s%n", i, "False");
            }
        }
    }
}

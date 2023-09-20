import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c= scan.nextInt();
        int minutes = (a+b+c)/60;
        int second = (a+b+c)%60;
        String secondsFormated;
        if(second<10){
            secondsFormated="0"+String.valueOf(second);
        }else {
            secondsFormated=String.valueOf(second);
        }
        System.out.printf("%s:%s",minutes, secondsFormated);
    }
}

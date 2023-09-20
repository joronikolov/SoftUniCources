import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers=scanner.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=1; i<=numbers;i++ ){
int current=scanner.nextInt();
if(current<min){
    min=current;
}
            if(current>max){
                max=current;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d",max,min);
    }


}

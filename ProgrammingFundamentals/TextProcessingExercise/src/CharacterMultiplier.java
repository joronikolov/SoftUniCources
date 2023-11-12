import java.util.Arrays;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        char[] row1 = input[0].toCharArray();
        char[] row2 = input[1].toCharArray();
        int sum=0;
        for (int i = 0; i<Math.min(row1.length, row2.length); i++){
            sum+=row1[i]*row2[i];
        }
        if( row1.length>row2.length){
            for(int i= row2.length; i < row1.length; i++){
                sum+=row1[i];
            }

            }else if(row1.length<row2.length){
            for(int i= row1.length; i < row2.length; i++){
                sum+=row2[i];
            }
        }
        System.out.println(sum);
    }
}

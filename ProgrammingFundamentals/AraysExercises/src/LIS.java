
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input = scan.nextLine();
        int[] seqArray = new int[input.length()];
        int foundElements=-1;
        for (int i=input.length()-1;i>0; i--){
            int curI=Integer.parseInt(String.valueOf(input.charAt(i)));
            if(foundElements>-1 && curI==seqArray[foundElements]-1){
                foundElements++;
                seqArray[foundElements]=Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            for (int j =i-1; j >=0; j--) {

            }
        }
    }
   }

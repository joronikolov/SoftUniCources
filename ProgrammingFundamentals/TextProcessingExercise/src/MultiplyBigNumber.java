
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bigNumber = scan.nextLine().split("");
        String multiplier = scan.nextLine();
        System.out.println(calculate(bigNumber, multiplier));

    }
    public static String calculate(String[] bigNumber, String multiplier){
        StringBuilder result = new StringBuilder();
        int remember=0;
        boolean hasValue=false;
        StringBuilder bigN = new StringBuilder();
        for (String s : bigNumber) {
            if (!s.equals("0")) {
                hasValue = true;
            }
            if (hasValue) {
                bigN.append(s);
            }
        }
        if(!hasValue || bigN.length()==0){
            bigN.append(0);
        }
        String[] newBigN = bigN.toString().split("");
        if(multiplier.isEmpty()){
            multiplier="0";
        }
        for(int i = newBigN.length-1; i>=0; i--){
            int curSum=Integer.parseInt(newBigN[i])*Integer.parseInt(multiplier)+remember;
            String[] strSum = String.valueOf(curSum).split("");

            if(i!=0){
                result.insert(0, strSum[strSum.length-1]);
            }else{
                result.insert(0, curSum);
            }
            if(strSum.length>1){
                remember=Integer.parseInt(strSum[0]);
            }
            else {
                remember = 0;
            }
        }
        return result.toString();
    }
}

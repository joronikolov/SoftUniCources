
import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String stringMax="";
            int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
for(int i = curArray.length-1; i>=0;i--){
    if(curArray[i]>max){
        max=curArray[i];
        stringMax=max+" "+stringMax;
    }
}
        System.out.println(stringMax);
    }
}

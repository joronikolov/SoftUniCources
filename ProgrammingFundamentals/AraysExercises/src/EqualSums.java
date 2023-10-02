
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean found=false;
                   int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

for(int i=0; i<curArray.length;i++){
    int leftSum=0;
    int rightSum=0;
    for(int j=0; j<i;j++){
        leftSum+=curArray[j];
    }

        for (int j = curArray.length-1; j >i ; j--) {
            rightSum += curArray[j];
        }
    if(leftSum==rightSum){
        System.out.println(i);
        found=true;
    }
}
if(found==false){
    System.out.println("no");
}
    }
}

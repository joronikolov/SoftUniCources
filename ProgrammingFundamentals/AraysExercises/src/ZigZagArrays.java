
import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] firstArray = new  int[n];
        int[] secondArray = new  int[n];
        int counter1=0;
        int counter2=0;
        for(int i =0 ; i<n; i++){
            int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j=0; j<curArray.length; j++){
           if(i%2==0){
               if(j%2==0){
                   firstArray[counter1]=curArray[j];
                   counter1++;
               }else{
                   secondArray[counter2]=curArray[j];
                   counter2++;
               }
           }else {
               if(j%2!=0){
                   firstArray[counter1]=curArray[j];
                   counter1++;
               }else{
                   secondArray[counter2]=curArray[j];
                   counter2++;
               }

           }
            }
        }
for(Integer v:firstArray){
    System.out.printf("%d ", v);
}
        System.out.println();
        for(Integer v:secondArray){
            System.out.printf("%d ", v);
        }
    }
}

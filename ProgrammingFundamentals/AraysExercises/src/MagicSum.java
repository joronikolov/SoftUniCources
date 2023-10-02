
import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber=Integer.parseInt(scan.nextLine());
        int[] magicArray= new int[curArray.length];
        int sum=0;

for(int i=0; i<curArray.length; i++){

    for (int j=i+1;j<curArray.length;j++){
        int magicArrayLength=1;
        sum=0;
        magicArray= Arrays.stream("0 ".repeat(curArray.length).split(" ")).mapToInt(Integer::parseInt).toArray();
        magicArray[0]=curArray[i];
        sum+=curArray[i];
        sum+=curArray[j];
        magicArray[magicArrayLength]=curArray[j];
        magicArrayLength++;
        if(sum==magicNumber){
            for(int t=0 ;t<magicArrayLength; t++){
                System.out.printf("%d ", magicArray[t]);

            }
            magicArray= Arrays.stream("0 ".repeat(curArray.length).split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println();

        }
    }
}

    }
}

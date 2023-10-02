import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] sortedArray = new int[n];
        int[] unsortedArray = new int[n];

        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        for (int i=0; i<n; i++){
        String[] word = scan.nextLine().split("");
        int sum=0;

        for(String e : word){
            if(vowels.contains(e)){
                sum+=(e.charAt(0))* word.length;
            }else {
                sum+=(e.charAt(0))/ word.length;
            }
        }
        unsortedArray[i]=sum;

        }
        int[] buffer = new int[unsortedArray.length];
        int[] tmp = Arrays.copyOf(unsortedArray,unsortedArray.length);
        for(int i=0; i< tmp.length; i++){
            int min=Integer.MAX_VALUE;
            int lastUpdatedIndex=-1;
            for(int j=0; j< tmp.length; j++){
                if(tmp[j]<min ){
                    min=tmp[j];
                    lastUpdatedIndex=j;
                }
            }
            buffer[i]=min;
            tmp[lastUpdatedIndex]=Integer.MAX_VALUE;
            min=Integer.MAX_VALUE;

        }
        sortedArray=buffer;
        for(int e : sortedArray){
            System.out.println(e);
        }
    }
}

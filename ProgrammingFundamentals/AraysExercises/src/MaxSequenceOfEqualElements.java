
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean found=false;
                   int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
String seq="";
String strLongestSeq="";
int longestSeq=0;
int curSeq=0;
int numberOfSeq=0;

for(int i=curArray.length-1; i>0;i--){
    if(curArray[i]==curArray[i-1]){
        if(!found){
            if(numberOfSeq>0){
                seq="";
            }
            seq=curArray[i]+" "+curArray[i-1];
            numberOfSeq++;
            found=true;
            curSeq++;

        }else {
            seq+=" "+curArray[i-1];
        }
        curSeq++;
        if(i==1){
            if(curSeq>=longestSeq){
                strLongestSeq=seq;
                longestSeq=curSeq;

            }
        }

    }else {
        if(curSeq>=longestSeq){
            strLongestSeq=seq;
            longestSeq=curSeq;

        }
        curSeq=0;
        found=false;
        seq="";
    }

}
        System.out.println(strLongestSeq);

    }
}

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N= scan.nextInt();
        scan.nextLine();
        for(int i=1111 ; i<=9999; i++){
            int notDevided=0;
            String iString=String.valueOf(i);
            for(int j=1;j<=iString.length();j++){
                String chr=""+iString.charAt(j-1);
                int curNum=Integer.parseInt(chr) ;
                if(curNum!=0&&N%curNum!=0){
                    notDevided++;
                }
            }
            if(notDevided==0 && !iString.contains("0")){
                System.out.printf("%d ",i);
            }
        }
    }

}

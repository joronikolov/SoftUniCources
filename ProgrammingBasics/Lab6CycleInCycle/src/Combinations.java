import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt();
        scan.nextLine();
        int tries=0;
        for(int i=0; i<=res;i++){
            for (int j=0; j<=res; j++){
                for(int k=0; k<=res;k++){
                    if(i+j+k==res){
                        tries++;
                    }
                }
            }
        }
        System.out.println(tries);
    }
}

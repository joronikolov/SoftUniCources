import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=scan.nextDouble();
        scan.nextLine();
        int cnt=0;

        sum=Math.floor(sum*100);

        while(sum>0){
            if(sum-200>=0){
                sum-=200;
                cnt++;
            } else if (sum-100>=0) {
                sum-=100;
                cnt++;
            }else if (sum-50>=0) {
                sum-=50;
                cnt++;
            }else if (sum-20>=0) {
                sum-=20;
                cnt++;
            }else if (sum-10>=0) {
                sum-=10;
                cnt++;
            }else if (sum-5>=0) {
                sum-=5;
                cnt++;
            }else if (sum-2>=0) {
                sum-=2;
                cnt++;
            }else if (sum-1>=0) {
                sum-=1;
                cnt++;
            }else {
                System.out.println(sum);
            }




        }
        System.out.println(cnt);
    }
}

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int remaining=255;
        int sum=0;
        for(int i=0; i<n;i++){
            int add = Integer.parseInt(scan.nextLine());
            if(remaining-add<0){
                System.out.println("Insufficient capacity!");
            }else {
                remaining-=add;
                sum+=add;
            }


        }
        System.out.println(sum);

    }
}

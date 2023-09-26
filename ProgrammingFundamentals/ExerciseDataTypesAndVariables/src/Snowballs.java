import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSnowballs=Integer.parseInt(scan.nextLine());
        double max=Double.MIN_VALUE;
        int maxSnowballSnow=0, maxSnowballTime=0, maxSnowballQuality=0;

        for(int i=1; i<=numberOfSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            double res=Math.pow((double)snowballSnow / snowballTime, snowballQuality);
            if(res>max){
                max=res;
                maxSnowballSnow=snowballSnow;
                        maxSnowballTime=snowballTime;
                maxSnowballQuality=snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, max, maxSnowballQuality);

    }
}

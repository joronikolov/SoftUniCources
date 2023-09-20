import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double record=scan.nextDouble();
        double distance = scan.nextDouble();
        double secondsPerMeter=scan.nextDouble();
        double delay=(Math.floor(distance/15)*12.5);
        double personalResult=distance*secondsPerMeter+delay;
        if(personalResult<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", personalResult);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",personalResult -record);
        }
    }
}

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyAmount = Double.parseDouble(scan.nextLine());
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double lightsaberPrice=Double.parseDouble(scan.nextLine());
        double robePrice=Double.parseDouble(scan.nextLine());
        double beltPrice=Double.parseDouble(scan.nextLine());
        double neededMoney=0;
        neededMoney=Math.ceil(numberOfStudents*1.1)*lightsaberPrice+numberOfStudents*robePrice+(numberOfStudents-numberOfStudents/6)*beltPrice;
        if(moneyAmount-neededMoney>=0){
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", neededMoney-moneyAmount);
        }
    }
}
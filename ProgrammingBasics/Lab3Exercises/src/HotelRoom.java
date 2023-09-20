import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double studioPrice=0d;
        double apartPrice=0d;
        String month = scan.nextLine();
        int sleeps=scan.nextInt();
        switch (month){
            case "October":
            case "May":

                studioPrice=50.0;
                apartPrice=65.0;
                if(sleeps>7&&sleeps<=14){
studioPrice-=studioPrice*5.0/100;
                } else if (sleeps>14) {
                    studioPrice-=studioPrice*30.0/100;
                }
                break;
            case "June":
            case "September":
                studioPrice=75.2;
                apartPrice=68.7;
                if (sleeps>14) {
                    studioPrice-=studioPrice*20.0/100;
                }
                break;
            case "July":
            case "August":
                studioPrice=76.0;
                apartPrice=77.0;
                break;
        }
        if(sleeps>14){
            apartPrice-=apartPrice*10.0/100;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",apartPrice*sleeps, studioPrice*sleeps);

    }
}

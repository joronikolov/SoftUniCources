import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayToStay= scan.nextInt();
        scan.nextLine();
        String roomType= scan.nextLine();
        String evaluation=scan.nextLine();
        double singleRoom=18.00;
        double apartment=25.00;
        double presidentApartment=35.00;
        if(dayToStay>=0&&dayToStay<10){
            apartment-=apartment*30.0/100;
            presidentApartment-=presidentApartment*10.0/100;
        } else if (dayToStay>=10&&dayToStay<=15) {
            apartment-=apartment*35.0/100;
            presidentApartment-=presidentApartment*15.0/100;
        }else if (dayToStay>15) {
            apartment-=apartment*50.0/100;
            presidentApartment-=presidentApartment*20.0/100;
        }
        if(evaluation.equals("positive")){
            apartment+=apartment*25.0/100;
            presidentApartment+=presidentApartment*25.0/100;
            singleRoom+=singleRoom*25.0/100;
        }else {
            apartment-=apartment*10.0/100;
            presidentApartment-=presidentApartment*10.0/100;
            singleRoom-=singleRoom*10.0/100;
        }
        double finalPrice=0;
        dayToStay--;
        switch (roomType){
            case "room for one person":
                finalPrice=dayToStay*singleRoom;
                break;
            case "apartment":
                finalPrice=dayToStay*apartment;
                break;
            case "president apartment":
                finalPrice=dayToStay*presidentApartment;
                break;
        }
        System.out.printf("%.2f",finalPrice );

    }
}

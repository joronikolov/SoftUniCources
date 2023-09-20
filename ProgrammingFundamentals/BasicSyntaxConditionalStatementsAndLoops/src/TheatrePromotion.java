import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> weekday = new HashMap<>();
        weekday.put("0-18",12);
        weekday.put("18-64",18);
        weekday.put("64-122",12);
        HashMap<String, Integer> weekend = new HashMap<>();
        weekend.put("0-18",15);
        weekend.put("18-64",20);
        weekend.put("64-122",15);
        HashMap<String, Integer> holiday = new HashMap<>();
        holiday.put("0-18",5);
        holiday.put("18-64",12);
        holiday.put("64-122",10);
        String day=scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String ageRange="ba";
        int price=0;
        if(age >=0 && age<=18){
            ageRange="0-18";
        } else if (age >=19 && age<=64) {
            ageRange="18-64";
        }else if (age >=65 && age<=122) {
            ageRange="64-122";
        }
        if(day.equals("Weekday")){

            price=weekday.containsKey(ageRange)?weekday.get(ageRange):-20;
        } else if (day.equals("Weekend")) {
            price=weekend.containsKey(ageRange)?weekend.get(ageRange):-20;
        } else if (day.equals("Holiday")) {
            price=holiday.containsKey(ageRange)?holiday.get(ageRange):-20;
        }
        if(price>0){
            System.out.printf("%d$",price);
        }else{
            System.out.println("Error!");
        }
    }

}

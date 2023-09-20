import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        int grade=0;
        int bad=0;
        double avg=0;
        while(grade<12){
            double assessment= scan.nextDouble();
            scan.nextLine();
            if(assessment>=4d){
                grade++;
                avg+=assessment;

            }else {
                bad++;
                if(bad>1){
                    System.out.printf("%s has been excluded at %d grade",name,grade+1);
                    break;
                }




            }

        }
        if(grade==12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avg / grade);
        }

    }
}

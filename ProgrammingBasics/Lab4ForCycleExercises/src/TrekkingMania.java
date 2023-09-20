import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int groups= scan.nextInt();
        scan.nextLine();
        int musala=0;
        int montBlanc=0;
        int kilimandjaro=0;
        int k2=0;
        int everest=0;
        int people=0;
        for(int i=0;i<groups;i++){
            int numberOfPeople = scan.nextInt();
            scan.nextLine();
            people+=numberOfPeople;
            if(numberOfPeople>=1 && numberOfPeople<=5){
                musala+=numberOfPeople;
                
            } else if (numberOfPeople>=6&& numberOfPeople<=12) {
                montBlanc+=numberOfPeople;
            } else if (numberOfPeople>=13&& numberOfPeople<=25) {
                kilimandjaro+=numberOfPeople;
            } else if (numberOfPeople>=26&& numberOfPeople<=40) {
                k2+=numberOfPeople;
            } else if (numberOfPeople>=41) {
                everest+=numberOfPeople;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",1.0*musala/people*100,1.0*montBlanc/people*100,1.0*kilimandjaro/people*100,1.0*k2/people*100,1.0*everest/people*100);
    }
}

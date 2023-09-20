import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers=scan.nextInt();
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;
        for (int i=0;i<numbers;i++){
            int current= scan.nextInt();
        if(current<200){
            p1++;
        } else if (current>=200 && current<=399) {
            p2++;
        }else if (current>=400 && current<=599) {
            p3++;
        }else if (current>=600 && current<=799) {
            p4++;
        }else if (current>=800 ) {
            p5++;
        }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",((double)p1/numbers)*100,((double)p2/numbers)*100,((double)p3/numbers)*100,((double)p4/numbers)*100,((double)p5/numbers)*100);
    }
}

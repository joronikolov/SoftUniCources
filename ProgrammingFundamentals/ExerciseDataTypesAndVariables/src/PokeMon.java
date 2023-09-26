import java.util.Scanner;
public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int power=Integer.parseInt(scan.nextLine());
        int curPower=power;
        int distance=Integer.parseInt(scan.nextLine());
        int exhaustionFactor=Integer.parseInt(scan.nextLine());
        int poked=0;
        while(curPower>=distance){
            curPower -= distance;
            poked+=1;
            if(curPower*2==power && exhaustionFactor!=0){
            curPower/=exhaustionFactor;
            }
        }
        System.out.printf("%d%n%d",curPower, poked);
//        System.out.println(curPower);
//        System.out.println(poked);

    }
}

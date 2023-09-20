import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double salesVolume = scan.nextDouble();
        double commission=0;
        boolean isValid=true;
        if(salesVolume>=0 && salesVolume<=500){
            if(city.equals("Sofia")){
                commission=5/100d;
            }else if(city.equals("Varna")){
commission=4.5/100d;
            }else if(city.equals("Plovdiv")){
                commission=5.5/100d;
            }else {
                isValid=false;
            }
        } else if (salesVolume>500 && salesVolume<=1000) {
            if(city.equals("Sofia")){
                commission=7/100d;
            }else if(city.equals("Varna")){
                commission=7.5/100d;
            }else if(city.equals("Plovdiv")){
                commission=8/100d;
            }else {
                isValid=false;
            }
        }else if (salesVolume>1000 && salesVolume<=10000) {
            if(city.equals("Sofia")){
                commission=8/100d;
            }else if(city.equals("Varna")){
                commission=10/100d;
            }else if(city.equals("Plovdiv")){
                commission=12/100d;
            }else {
                isValid=false;
            }
        }else if (salesVolume>10000) {
            if(city.equals("Sofia")){
                commission=12/100d;
            }else if(city.equals("Varna")){
                commission=13/100d;
            }else if(city.equals("Plovdiv")){
                commission=14.5/100d;
            }else {
                isValid=false;
            }
        }else {
            isValid=false;
        }
        if(isValid){
            System.out.printf("%.2f", commission*salesVolume);
        }else {
            System.out.println("error");
        }
    }
}

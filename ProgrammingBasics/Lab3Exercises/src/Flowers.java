import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rosesPrice=5d;
        double dahliasPrice=3.8;
        double tulipsPrice=2.8;
        double narcissusPrice=3d;
        double gladiolusPrice=2.5;
        String flowerType=scan.nextLine();
        int numberOfFlowers = scan.nextInt();
        int budget = scan.nextInt();
double totalSum;
        if(flowerType.equals("Roses")){
        totalSum=numberOfFlowers*rosesPrice;
        if(numberOfFlowers>80){
            totalSum=totalSum-totalSum*(10d/100);
        }
        } else if (flowerType.equals("Dahlias")) {
            totalSum=numberOfFlowers*dahliasPrice;
            if(numberOfFlowers>90){
                totalSum=totalSum-totalSum*(15d/100);
            }
        }else if (flowerType.equals("Tulips")) {
            totalSum=numberOfFlowers*tulipsPrice;
            if(numberOfFlowers>80){
                totalSum=totalSum-totalSum*(15d/100);
            }
        }else if (flowerType.equals("Narcissus")) {
            totalSum=numberOfFlowers*narcissusPrice;
            if(numberOfFlowers<120){
                totalSum=totalSum+totalSum*(15d/100);
            }
        }else if (flowerType.equals("Gladiolus")) {
            totalSum=numberOfFlowers*gladiolusPrice;
            if(numberOfFlowers<80){
                totalSum=totalSum+totalSum*(20d/100);
            }
        }
        else {
            totalSum=0;
        }
        if ((double)budget-totalSum>=0){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers, flowerType,(double)budget-totalSum );
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs((double)budget-totalSum ));
        }
    }
}

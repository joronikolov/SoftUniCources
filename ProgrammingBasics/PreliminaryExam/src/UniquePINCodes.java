import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstLimit= scan.nextInt();
        scan.nextLine();
        int secondLimit= scan.nextInt();
        scan.nextLine();
        int thirdLimit= scan.nextInt();
        scan.nextLine();
        boolean isSimple=true;
        for(int i=2;i<=firstLimit;i++){

            if(i%2==0) {

                for (int j = 2; j <= secondLimit; j++) {
                    isSimple=true;
                    for (int f = 2; f <=j ; f++) {
                        if(j%f==0&j!=f&f!=1){
                            isSimple=false;
                            break;
                        }
                    }
                    if (j <= 7 & isSimple) {
                        for (int k = 2; k <= thirdLimit; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d%n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}

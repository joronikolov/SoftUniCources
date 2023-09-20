import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = scan.nextInt();
        scan.nextLine();
        int roomsPerFloor = scan.nextInt();
        scan.nextLine();
        char prefix;
        for(int i=floors;i>=1;i--){
            if(i==floors){
                prefix='L';
            } else if (i%2==0) {
                prefix='O';
                
            }else {
                prefix='A';
            }
            for(int j=0;j<roomsPerFloor;j++){
                System.out.printf("%s%d%d ",prefix,i,j);
            }
            System.out.println();
        }
    }
}

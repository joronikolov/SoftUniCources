import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(subtract(new int[]{sum(new int[] {a,b}),c}));

    }
    public static int sum(int[] Args){
        int sum = 0;
        for (int e : Args){
           sum+=e;
        }
        return sum;
    }
    public static int subtract(int[] Args){
        int sum = Args[0];
        for (int i = 1; i<Args.length;i++ ){
            sum-=Args[i];
        }
        return sum;
    }
}

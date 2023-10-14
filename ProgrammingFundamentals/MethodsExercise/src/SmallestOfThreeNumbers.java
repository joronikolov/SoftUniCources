import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(getSmallest(new int[] {a,b,c}));

    }
    public static int getSmallest(int[] Args){
        int max = Integer.MAX_VALUE;
        for (int e : Args){
            if (e<=max){
                max=e;
            }
        }
        return max;
    }
}

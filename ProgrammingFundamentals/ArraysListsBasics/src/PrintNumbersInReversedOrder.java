import java.util.Scanner;

public class PrintNumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = new String[Integer.parseInt(scan.nextLine())];

        for (int i=nums.length-1;i>=0;i--){
nums[i]=scan.nextLine();
        }
        System.out.println(String.join(" ", nums));

    }
}

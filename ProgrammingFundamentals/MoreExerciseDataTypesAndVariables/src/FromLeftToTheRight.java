import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            String currentString = scan.nextLine();
            String string1 = currentString.split(" ")[0];
            String string2 = currentString.split(" ")[1];
            long left = Long.parseLong(string1);
            long right = Long.parseLong(string2);
            long sum = 0;
            if (left > right) {
                left=Math.abs(left);
                while (left > 0) {
                    sum += left % 10;
                    left /= 10;

                }
            } else {
                right=Math.abs(right);
                while (right > 0) {
                    sum += right % 10;
                    right /= 10;
                }
            }
            System.out.println(sum);
        }

    }
}

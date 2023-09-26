import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.RoundingMode.*;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            String currentString = scan.nextLine();
            String string1 = currentString.split(" ")[0];
            String string2 = currentString.split(" ")[1];
//            long left = Long.parseLong(string1);
//            long right = Long.parseLong(string2);
            BigDecimal left = new BigDecimal(string1);
            BigDecimal right = new BigDecimal(string2);
            BigDecimal sum = BigDecimal.valueOf(0);
            if (left.compareTo(right) > 0) {
                while (left.compareTo(BigDecimal.valueOf(0)) > 0) {
                    sum = sum.add(left.remainder(BigDecimal.valueOf(10)));
                    left = left.divide(BigDecimal.valueOf(10)).round(new MathContext(1, RoundingMode.FLOOR));

                }
            } else {
                while (right.compareTo(BigDecimal.valueOf(0)) > 0) {
                    sum = sum.add(right.remainder(BigDecimal.valueOf(10)));

                    right = right.divide(BigDecimal.valueOf(10)).round(new MathContext(1, RoundingMode.FLOOR)) ;

                }
                System.out.println(sum);
            }
        }

    }
}

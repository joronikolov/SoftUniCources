    import java.util.Scanner;

    public class TopNumber {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = Integer.parseInt(scan.nextLine());
            for (int i = 1; i <=a ; i++) {
                if(sumDevByEight(i) && holdsOddDig(i)){
                    System.out.println(i);
                }

            }

        }
        public static boolean sumDevByEight(int number){
            int sum = 0;
            while(number>0){
                sum+=number%10;
                number/=10;
            }
            return sum % 8 == 0;
        }
        public static boolean holdsOddDig(int number) {
            while (number > 0) {
                if (number % 10 % 2 != 0) {
                    return true;
                }
                number/=10;
            }
            return false;
        }
    }

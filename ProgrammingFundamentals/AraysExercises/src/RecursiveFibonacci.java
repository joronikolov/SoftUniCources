
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(GetFibonacci(n));


    }
    private static long GetFibonacci(int number){
        Map<String, Long> fibonachiBase = new HashMap<>();
        fibonachiBase.put("1",1L);
        fibonachiBase.put("2",1L);

        long result=0;
        while(result==0) {
            for (int i = 1; i <= number; i++) {
                if (fibonachiBase.containsKey(String.valueOf(i)) && fibonachiBase.containsKey(String.valueOf(i+1))
                        && !fibonachiBase.containsKey(String.valueOf(i+2))) {
                    fibonachiBase.put(String.valueOf(i+2), fibonachiBase.get(String.valueOf(i))+fibonachiBase.get(String.valueOf(i+1)));
                }
                if(fibonachiBase.containsKey(String.valueOf(number))){
                    result=fibonachiBase.get(String.valueOf(number));
                }

            }
        }
        return  result;
    }
}

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int suPrime=0;
int sumNonPrime =0;
        while(true) {
            String curInput = scan.nextLine();
            if(curInput.equals("stop")){
                break;
            }
            int num=Integer.parseInt(curInput);
            if(num<0) {
                System.out.println("Number is negative.");
                continue;
            }
            int divisions=0;
            for (int i = 2; i <num ; i++) {
                if(num%i==0){
                    divisions++;
                }
            }
            if(divisions==0){
            suPrime+=num;
            }else{
                sumNonPrime+=num;
            }
        }
        System.out.println("Sum of all prime numbers is: "+suPrime);
        System.out.println("Sum of all non prime numbers is: "+sumNonPrime);
        }
    }


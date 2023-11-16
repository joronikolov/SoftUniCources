import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        System.out.printf("%.2f", calculate(input));

    }
    private static double calculate(String[] input){
        double total=0;
        for (String s : input
        ) {
            double midSum=0;
            String firstLetter=String.valueOf(s.charAt(0));
            String secondLetter=String.valueOf(s.charAt(s.length()-1));
            double num=Double.parseDouble(s.replace(firstLetter,"").replace(secondLetter,""));
            double firstPosition=0;
            double secondPosition=0;
           if(firstLetter.equals(firstLetter.toUpperCase())){
               firstPosition=firstLetter.charAt(0)-64*1.0;
               midSum+=num/firstPosition;
           }else{
               firstPosition=firstLetter.charAt(0)-96*1.0;
               midSum+=num*firstPosition;
           }
            if(secondLetter.equals(secondLetter.toUpperCase())){
                secondPosition=secondLetter.charAt(0)-64*1.0;
                midSum-=secondPosition;
            }else{
                secondPosition=secondLetter.charAt(0)-96*1.0;
                midSum+=secondPosition;
            }
            total+=midSum;
        }
        return total;
    }
}

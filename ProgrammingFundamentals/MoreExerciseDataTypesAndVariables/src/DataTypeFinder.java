import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        String numbers = "1234567890";

        while(!input.equals("END")){
            String type ="integer";
            int dots=0;
            int signs=0;
            for(int i =0; i<input.length();i++){
                if(!numbers.contains(String.valueOf(input.charAt(i)))){
                    if(String.valueOf(input.charAt(i)).equals(".") && input.length()>1){
                        dots++;
                    }else if((String.valueOf(input.charAt(i)).equals("-") || String.valueOf(input.charAt(i)).equals("+")) && input.length()>1 && i==0){
                        signs++;
                    }else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {

                        type="boolean";
                        break;
                    } else if (input.length()==1) {
                        type="character";
                        break;

                    }else {
                        type="string";
                        break;
                    }
                }

            }
            if ((signs>1 || dots>1) || (input.equals("-0"))) {
                type="string";
            }
            if(dots==1 && type.equals("integer")){
                type="floating point";
            }
            System.out.printf("%s is %s type%n", input, type);
            input=scan.nextLine();
        }
    }
}

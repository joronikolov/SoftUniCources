import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scan.nextLine());
        int brackets =0;
        boolean balanced=true;
        for (int i = 0; i < numberOfLines; i++) {
            String character=scan.nextLine();
            if(character.equals("(") && brackets==0){
                brackets++;
            } else if (character.equals(")") && brackets==1) {
                brackets--;
            }else if((character.equals("(") && brackets!=0) || (character.equals(")") && brackets!=1)){
                balanced=false;

            }
        }
        if(brackets!=0 || !balanced){
            System.out.println("UNBALANCED");
        }else{
            System.out.println("BALANCED");
        }




    }
}


import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] curArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command=scan.nextLine();
        while(!command.equals("end")){
            String[] commands=command.split(" ");
            switch(commands[0]){
                case "swap":
                    int container=curArray[Integer.parseInt(commands[1])];
                    curArray[Integer.parseInt(commands[1])]=curArray[Integer.parseInt(commands[2])];
                    curArray[Integer.parseInt(commands[2])]=container;
                    break;
                case "multiply":
                    curArray[Integer.parseInt(commands[1])]=curArray[Integer.parseInt(commands[1])]*curArray[Integer.parseInt(commands[2])];
                    break;
                case "decrease":
                    for(int j = 0; j< curArray.length; j++){
                        curArray[j]=curArray[j]-1;
                    }
                    break;
            }

            command=scan.nextLine();
        }
        for(int j = 0; j< curArray.length; j++){
            System.out.print(curArray[j]+((j== curArray.length-1)?"":", "));
        }




    }
}

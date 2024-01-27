import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split("\\s");
        String[][] matrix = new String[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];

        for(int i =0; i<Integer.parseInt(dimensions[0]); i++){
            String[] curRow=scan.nextLine().split("\\s");
            for(int j =0; j<Integer.parseInt(dimensions[1]); j++){
                matrix[i][j]=curRow[j];
            }
        //    matrix[i] = scan.nextLine().split("\\s");
        }
        String[] command = scan.nextLine().split("\\s");
        while (!"END".equals(command[0])){
            boolean valid =true;
            for(int i=1; i<command.length-1; i++) {
                if (i % 2 != 0 & ((Integer.parseInt(command[i]) < 0 || Integer.parseInt(command[i]) > Integer.parseInt(dimensions[1])))) {
                    valid = false;
                } else if (i % 2 == 0 & ((Integer.parseInt(command[i]) < 0 || Integer.parseInt(command[i]) > Integer.parseInt(dimensions[0])))) {
                    valid = false;
                }
            }
                if(!"swap".equals(command[0]) || command.length!=5 || !valid){
                    System.out.println("Invalid input!");
                }else {
                    String tmp;
                    int row1=Integer.parseInt(command[1]);
                    int col1=Integer.parseInt(command[2]);
                    int row2=Integer.parseInt(command[3]);
                    int col2=Integer.parseInt(command[4]);
                    tmp=matrix[row1][col1];
                    matrix[row1][col1]=matrix[row2][col2];
                    matrix[row2][col2]=tmp;
                    for(int f = 0; f < Integer.parseInt(dimensions[0]); f++){
                        for (int j = 0; j < Integer.parseInt(dimensions[1]); j++) {
                            System.out.printf("%s ", matrix[f][j]);
                        }
                        System.out.println();
                    }
                }


            command=scan.nextLine().split("\\s");
        }
    }
}

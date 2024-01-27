import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        int rotation = Integer.parseInt(scan.findInLine("\\d+"));
        scan.nextLine();
        String command = scan.nextLine();
        int max = 0;
        while(!"END".equals(command)){
            if(command.length()>max){
                max=command.length();
            }
            list.add(command);
            command = scan.nextLine();
        }
        String[][] matrix = new String[list.size()][max];
        for(int i =0; i<list.size(); i++){
            matrix[i]=list.get(i).split("");
        }
        for(int i=0; i<rotation/90; i++) {
            matrix = rotate(matrix);
        }
        for (int i = 0; i<matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j]!=null) {
                        System.out.printf("%s", matrix[i][j]);
                    }else{
                        System.out.print(" ");
                    }

            }
            System.out.println();
        }

    }
    private static String[][] rotate(String[][] inputMatrix){
        int rows=0;
        int cols=0;
        for(String[] row : inputMatrix){
            rows++;
            if(row.length>cols){
                cols=row.length;
            }
        }

        String[][] result = new String[cols][rows];
        int altI=rows-1;
        for(int i =0; i< rows; i++){

//            for(String s : inputMatrix[i]){
//                result[j][i]
//            }
            for(int j = 0; j<inputMatrix[i].length ; j++){
                result[j][altI]=inputMatrix[i][j];

            }
            altI--;
        }

        return result;
    }
}

package Armory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[][] matrix = new String[n][n];
        for(int i = 0 ; i< n; i++){

            matrix[i] = scan.nextLine().split("");


        }
        int row = 0;
        int col = 0;
        int[] coordinates = findLetter(matrix,"A");
        row=coordinates[0];
        col=coordinates[1];
        boolean exit = false;
        int sum =0;
        while (!outOfBonds(row, col, n) & sum<65){
            String command=scan.nextLine();
            matrix[row][col]="-";
            coordinates=inputCommand(command, row, col);
            row=coordinates[0];
            col=coordinates[1];
            if(outOfBonds(row, col, n) ){
                break;
            }
            String curField=matrix[row][col];

            if(curField.equals("M")){
                matrix[row][col]="-";
                coordinates = findLetter(matrix,"M");
                row=coordinates[0];
                col=coordinates[1];

            } else if ( matrix[row][col].matches("\\d")) {
                            sum+=Integer.parseInt( matrix[row][col]);

            }
            matrix[row][col]="A";

        }
        if(sum>=65){
            System.out.println("Very nice swords, I will come back for more!");
        }else {
            System.out.println("I do not need more swords!");
        }
        System.out.printf("The king paid %d gold coins.%n", sum);
        for (String[] a : matrix){
            for (String s : a){
                System.out.print(s);
            }
            System.out.println();
        }


    }
    public static int[] findLetter(String[][] array, String letter){
        int[] res = new int[]{-1, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j].equals(letter)){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
    public static boolean outOfBonds(int row, int column, int bounds){
        if (row>=bounds | column>=bounds | row<0 | column<0){
            return true;
        }
        return false;
    }
    public static int[] inputCommand(String input, int row, int col){
        switch (input){
            case "up":
                row-=1;
                break;
            case "down":
                row+=1;
                break;
            case "left":
                col-=1;
                break;
            case "right":
                col+=1;
                break;
        }
        int[] res = new int[]{row,col};
        return res;
    }

}

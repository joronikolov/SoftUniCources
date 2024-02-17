package StickyFingers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] commands = scan.nextLine().split(",");
        String[][] field = new String[n][n];
        for(int i=0; i<n; i++){
            field[i]=scan.nextLine().split("\\s+");
        }
        int[] coordinates = new int[2];
        coordinates=findSymbol(field, "D");
        int row = coordinates[0];
        int column = coordinates[1];
        int pocket =0;
        boolean exit=false;
        for(String s : commands){
            int[] desiredPosition =move(row, column, s);
            if(!outOfBounds(desiredPosition[0], desiredPosition[1], n)){
            field[row][column]="+";
            row=desiredPosition[0];
            column=desiredPosition[1];
            String currentField = field[row][column];
            switch (currentField){
                case "+":
                    field[row][column]="D";

                    break;
                case "$":
                    pocket+=row*column;
                    field[row][column]="D";
                    System.out.printf("You successfully stole %d$.%n", row*column);
                    break;
                case "P":
                    field[row][column]="#";
                    exit = true;
                    System.out.printf("You got caught with %d$, and you are going to jail.%n", pocket);
                    break;
            }
            if(exit){
                break;
            }
            }else {
                System.out.println("You cannot leave the town, there is police outside!");
            }
        }
        if(!exit){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", pocket);
        }
        for (String[] r : field){
            System.out.println(String.join(" ", r));
        }
    }
    public static boolean outOfBounds(int row, int column, int size){
        return !(row>=0 & row<size & column>=0 & column<size);
    }
    public static int[] findSymbol(String[][] array, String symbol){
        for(int i=0; i< array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if(symbol.equals(array[i][j])){
                    return new int[]{i,j};
                }

            }

        }
        return  null;
    }
    public static int[] move(int row, int column, String command){
        switch(command){
            case "up":
                row-=1;
                break;
            case "down":
                row+=1;
                break;
            case "right":
                column+=1;
                break;
            case "left":
                column-=1;
                break;
        }
        return new int[]{row,column};
    }

}

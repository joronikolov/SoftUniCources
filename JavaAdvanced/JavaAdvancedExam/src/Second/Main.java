package Second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int armor = 300;
        String[][] field = new String[n][n];
        for(int i=0; i<n; i++){
            field[i]=scan.nextLine().split("");
        }
        int[] coordinates = new int[2];
        coordinates=findSymbol(field, "J");
        int enemyPlanes = 0;
        for(String[] s : field){
            for(String f : s){
                if("E".equals(f)){
                    enemyPlanes+=1;
                }
            }
        }
        while(armor>0 & enemyPlanes>0){
            String command = scan.nextLine();
            int[] newCoordinates = move(coordinates[0], coordinates[1], command);
            if(!outOfBounds(newCoordinates[0], newCoordinates[1], n)){
                field[coordinates[0]][coordinates[1]]="-";
                coordinates=newCoordinates;
                int row=coordinates[0];
                int column = coordinates[1];
                switch (field[row][column]){
                    case "E":
                        if(enemyPlanes>1){
                            armor-=100;
                        }
                        field[row][column]="J";
                        enemyPlanes-=1;
                        break;
                    case "-":
                        field[row][column]="J";
                        break;
                    case "R":
                        field[row][column]="J";
                        armor=300;
                        break;
                }
            }
        }
        if(armor==0){
            System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!%n", coordinates[0], coordinates[1]);
        }else{
            System.out.println("Mission accomplished, you neutralized the aerial threat!");
        }
        for(String[] s : field){
            for(String f : s){
                System.out.print(f);
            }
            System.out.println();
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

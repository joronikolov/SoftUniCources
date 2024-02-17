package Froggy;

import java.util.Scanner;

public class Main {
    static Lake lake;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split(",\\s+");
        while(!"END".equals(command[0])){
           lake=new Lake(command);
            command = scan.nextLine().split(",\\s+");
        }
        int[] index ={0};
        lake.forEach(e->{

            System.out.print(e+(( index[0]!=lake.size()-1)?", ": " "));
            index[0]=index[0]+1;
        });

    }
}

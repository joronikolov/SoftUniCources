package RawData;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<Car> cars = new LinkedHashSet<>();
        String[] command;
        for (int i = 0; i < n; i++) {
            command = scan.nextLine().split("\\s+");
            cars.add(new Car(command[0], Double.parseDouble(command[1]), Double.parseDouble(command[2]) ));

        }
        command = scan.nextLine().split("\\s+");
        while(!"End".equals(command[0])){
for (Car c : cars){
    if (c.getModel().equals(command[1])){
        if(!c.canDrive(Double.parseDouble(command[2]))){
            System.out.println("Insufficient fuel for the drive");
        };
    };
}
            command = scan.nextLine().split("\\s+");

        }
        for (Car c : cars){
            System.out.println(c);
        }

    }
}

package VehicleCatalogue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command=scan.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        while(!command.equals("End")){
            String[] current = command.split(" ");
            vehicleList.add(new Vehicle(current[0],current[1],  current[2], Integer.parseInt(current[3])));
            command=scan.nextLine();
        }
        command=scan.nextLine();
        while (!command.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicleList) {
                if(vehicle.getModelOfVehicle().equals(command)){
                    System.out.println(vehicle.getInfo());
                }
            }
            command=scan.nextLine();
        }
        double avgHpCars=0;
        double avgHpTrucks=0;
        int sumHpCars=0;
        int sumHpTrucks=0;
        int cntCars=0;
        int cntTrucks=0;
        for (Vehicle vehicle : vehicleList
             ) {
            if(vehicle.getTypeOfVehicle().equals("Car")){
                cntCars++;
                sumHpCars+=vehicle.getHorsepowerOfVehicle();
            }else if(vehicle.getTypeOfVehicle().equals("Truck")){
                cntTrucks++;
                sumHpTrucks+= vehicle.getHorsepowerOfVehicle();
            }
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", (cntCars==0)?0:1.0*sumHpCars/cntCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", (cntTrucks==0)?0:1.0*sumHpTrucks/cntTrucks);



    }
}

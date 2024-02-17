package PetClinics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Clinic> clinics = new HashMap<>();
        Map<String, Pet> pets = new HashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split("\\s+");
            switch(command[0]){
                case "Create":
                    switch(command[1]){
                        case "Pet":
                            pets.put(command[2], new Pet(command[2],Integer.parseInt(command[3]), command[4] ));

                            break;
                        case "Clinic":
                            Clinic curClinic=null;
                            try{
                                curClinic=new Clinic(command[2],Integer.parseInt(command[3]));
                            }catch (IllegalArgumentException ex){
                                System.out.println(ex.getMessage());
                            }

                            break;
                    }

                    break;
                case "Add":
                    System.out.println(clinics.get(command[2]).add(pets.get(command[1])));
                    break;
                case "Release":
                    System.out.println(clinics.get(command[1]).release());
                    break;
                case "HasEmptyRooms":
                    System.out.println(clinics.get(command[1]).hasEmptyRooms());
                    break;
            }

        }
    }
}

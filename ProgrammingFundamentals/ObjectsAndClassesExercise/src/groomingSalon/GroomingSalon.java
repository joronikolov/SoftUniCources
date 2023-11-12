package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private final int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        data=new ArrayList<>();
    }
    public void add(Pet pet){
        if(capacity-getCount()>0){
            data.add(pet);
        }
    }
    public boolean remove(String name){
        boolean remove=false;
        for (int i=0; i<data.size();i++) {
            if(data.get(i).getName().equals(name)){
                data.remove(data.get(i));
                remove=true;
            }
        }
        return remove;
    }
    public Pet getPet(String name, String owner){
        for (Pet pet: data
             ) {
            if(pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }
    public  int getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder result = new StringBuilder();
        result.append("The grooming salon has the following clients:");
        for (Pet pet : data
             ) {
            result.append(String.format("%n%s %s", pet.getName(), pet.getOwner()));

        }
        return  result.toString();
    }
}

package parrots;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        data = new LinkedList<>();
    }
    public void  add(Parrot parrot){
        if(this.data.size()<capacity) {
            this.data.add(parrot);
        }
    }
    public boolean remove(String name){
        for(Parrot p : data){
            if(p.getName().equals(name)){
                data.remove(p);
                return true;
            }
        }
        return false;
    }
    public Parrot sellParrot(String name){
        for(Parrot p : data){
            if(p.getName().equals(name)){
                p.setAvailable(false);
              //  System.out.println("Jooooooro "+name+"   "+ p.isAvailable());
                return p;
            }
        }
        return null;
    }
    public List<Parrot> sellParrotBySpecies(String species){
        List<Parrot> localData = new LinkedList<>();
        for(Parrot p : data){
            if(p.getSpecies().equals(species)){
                p.setAvailable(false);
                localData.add(p);
            }
        }

        return localData;
    }
    public int count(){
        return this.data.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Parrots available at %s:%n", this.getName()));
        for(Parrot p : data.stream().filter(Parrot::isAvailable).collect(Collectors.toList())){
            sb.append(p).append(String.format("%n"));
        }
        return sb.toString();
    }
}

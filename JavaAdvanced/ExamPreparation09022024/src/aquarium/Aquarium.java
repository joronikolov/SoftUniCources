package aquarium;

import java.util.LinkedList;
import java.util.List;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private List<Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }
    public void add(Fish fish){
        if(this.findFish(fish.getName())==null & getCapacity() > getFishInPool()){
            fishInPool.add(fish);
        }

    }
    public Fish findFish(String name){
        for(Fish f : this.fishInPool){
            if(name.equals(f.getName())){
                return f;
            }
        }
        return null;
    }
    public boolean remove(String name){

            return fishInPool.remove(findFish(name));

    }
    public String report(){
        StringBuilder sb = new StringBuilder();
               sb.append(String.format("Aquarium: %s ^ Size: %d%n", this.getName(), this.getSize()));
               for(Fish f : fishInPool){
                   sb.append(f);
               }

        return sb.toString();
    }
}

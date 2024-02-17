package sharkHaunt;

import java.util.LinkedList;
import java.util.List;

public class Basin {
    private String name;
    private int capacity;
    private List<Shark> sharks;

    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks =  new LinkedList<>();
    }
public void addShark(Shark shark){
        if(capacity>sharks.size()){
            sharks.add(shark);
        }else {
            System.out.println("This basin is at full capacity!");
        }
}
public Shark  getShark(String kind){
        for (Shark s : sharks){
            if(kind.equals(s.getKind())){
                return s;
            }
        }
        return null;
}
public boolean removeShark(String kind){
        if(getShark(kind)!=null){
            sharks.remove(getShark(kind));
            return true;
        }
        return false;
}
public Shark getLargestShark(){
        int max = Integer.MIN_VALUE;
        Shark maxShark = null;
        for(Shark s : sharks){
            if(s.getLength()>max){
                max=s.getLength();
                maxShark=s;
            }
        }
        return  maxShark;
}
public int getCount(){
        return sharks.size();
}

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAverageLength(){
        double avg=0d;
        avg = sharks.stream().mapToInt(Shark::getLength).average().getAsDouble();
        return (int) avg;
}
public String report(){
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("Sharks in %s:%n", this.getName()));
    for (Shark s : sharks){
        sb.append(s.toString());
    }
    return sb.toString();
}
}

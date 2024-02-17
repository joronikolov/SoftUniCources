package Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Lake implements Iterable{
    List<Integer> lake;
    public Lake(String[] array){
        lake=new LinkedList<>();
        lake= Arrays.stream(array).map(Integer::parseInt).collect(Collectors.toList());
    }
    @Override
    public Frog iterator(){
        return new Frog();
    }
    public class Frog implements Iterator{
        int index =0;
        boolean pairs=true;
        @Override
        public boolean hasNext(){
            if(pairs & !lake.isEmpty() & index<lake.size()){
                return true;
            }
            if(index>=lake.size()-1 & pairs){
                pairs=false;
                index=1;
            }
            return index<lake.size();
        }
        @Override
        public Integer next(){
            int element = lake.get(index);
            index+=2;
            return element;
        }

    }
    public int  size(){
        return lake.size();
    }

}

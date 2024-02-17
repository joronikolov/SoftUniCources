package StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.equals(o2)){
            return 0;
        }else{
            Person first= (Person) o1;
            Person second = (Person) o2;
            if(first.getName().length()==second.getName().length()){
                return String.valueOf(first.getName().charAt(0)).toLowerCase().compareTo(String.valueOf(second.getName().charAt(0)).toLowerCase());
            }
            return Integer.compare(first.getName().length(),second.getName().length());
        }
    }
}

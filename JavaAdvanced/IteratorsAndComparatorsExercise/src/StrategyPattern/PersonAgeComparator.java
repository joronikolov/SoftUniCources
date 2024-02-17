package StrategyPattern;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.equals(o2)){
            return 0;
        }else{
            Person first= (Person) o1;
            Person second = (Person) o2;

            return Integer.compare(first.getAge(),second.getAge());
        }
    }
}

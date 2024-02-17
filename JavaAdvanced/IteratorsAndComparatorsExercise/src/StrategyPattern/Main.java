package StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        PersonNameComparator nameComp=new PersonNameComparator();
        PersonAgeComparator ageComp=new PersonAgeComparator();

        Scanner scan = new Scanner(System.in);
        Set<Person> nameSet = new TreeSet<>(nameComp);
        Set<Person> ageSet = new TreeSet<>(ageComp);
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] command = scan.nextLine().split("\\s+");
            Person curPerson = new Person(command[0],Integer.parseInt(command[1]) );
            nameSet.add(curPerson);
            ageSet.add(curPerson);

        }
        nameSet.forEach(System.out::println);
        ageSet.forEach(System.out::println);
    }
}

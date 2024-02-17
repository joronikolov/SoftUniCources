package ComparingObjects;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split("\\s+");
        List<Person> persons = new LinkedList<>();

        while(!"END".equals(command[0])){
            persons.add(new Person(command[0], Integer.parseInt(command[1]), command[2]));
            command = scan.nextLine().split("\\s+");
        }
        int index = Integer.parseInt(scan.nextLine());
        int equal=0;
        int notEq=0;
        Person curPerson = null;
        if(index>=0 & index<persons.size()){
            curPerson = persons.get(index);
            for(Person p : persons){
                if(p.compareTo(curPerson)==0){
                    equal++;
                }else {
                    notEq++;
                }
            }

        }
        if(curPerson==null | equal==0){
            System.out.println("No matches");
        }else{
            System.out.printf("%d %d %d", equal, notEq, persons.size());
        }

    }
}

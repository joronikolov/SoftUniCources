package OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command=scan.nextLine();
        List<Person> personsList = new ArrayList<>();
        while(!command.equals("End")){
            String[] current = command.split(" ");
            personsList.add(new Person(current[0],current[1], Integer.parseInt(current[2])));
            command=scan.nextLine();
        }
       Collections.sort(personsList,Comparator.comparingInt(Person::getAge));
        for (Person person: personsList
             ) {
            System.out.println(person.getInfo());
        }


    }
}

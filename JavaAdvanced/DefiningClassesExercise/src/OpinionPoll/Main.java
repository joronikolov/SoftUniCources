package OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> persons= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split("\\s+");
            persons.add(new Person(command[0], Integer.parseInt(command[1])));
        }
        for(Person p : persons.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList())){
        if(p.getAge()>30){
            System.out.println(p);
        }
        }

    }
}

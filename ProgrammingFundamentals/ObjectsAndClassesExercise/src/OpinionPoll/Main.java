package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();
        for(int i=0; i<lines;i++){
            String[] current = scan.nextLine().split(" ");
            personList.add(new Person(current[0], Integer.parseInt(current[1])));

        }
        for (Person person: personList
             ) {
            if(person.getAge()>30){
                System.out.println(person.getInfo());
            }
        }

    }
}

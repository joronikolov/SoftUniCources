package EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Person> tree = new TreeSet<>();
        Set<Person> hash = new HashSet<>();
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] command = scan.nextLine().split("\\s+");
            Person curPerson = new Person(command[0],Integer.parseInt(command[1]) );
            tree.add(curPerson);
            hash.add(curPerson);

        }
        System.out.println(tree.size());
        System.out.println(hash.size());
    }
}

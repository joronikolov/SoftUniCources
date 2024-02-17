package ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split("\\s");
        ListyIterator li = new ListyIterator<>();



        while(!"END".equals(command[0])) {
            switch (command[0]) {
                case "Create":
                    String[] elements = Arrays.stream(command).skip(1).toArray(String[]::new);
                    li = new ListyIterator<>(elements);
                    break;
                  case "Move":
                      System.out.println(li.move());
                      break;
                case "HasNext":
                    System.out.println(li.hasNext());
                    break;
                case "Print":
                    try {
                        li.print();

                    } catch (IllegalStateException | NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

            }
            command = scan.nextLine().split("\\s");

        }
    }
}

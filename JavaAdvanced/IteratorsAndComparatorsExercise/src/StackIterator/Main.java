package StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split("\\s");
        Stack<Integer> li = new Stack<Integer>();



        while(!"END".equals(command[0])) {
            switch (command[0]) {
                case "Push":
                    String[] elements = Arrays.stream(command).skip(1).toArray(String[]::new);
                    for(String s : elements){
                        li.push(Integer.parseInt(s.replace(",","")));
                    }
                    break;
                  case "Pop":
                      li.pop();
                      break;

            }
            command = scan.nextLine().split("\\s");

        }
        li.forEach(System.out::println);
        li.forEach(System.out::println);
    }
}

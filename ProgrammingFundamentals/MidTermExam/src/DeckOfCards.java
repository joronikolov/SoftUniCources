import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> deck = new ArrayList<>(Arrays.asList(scan.nextLine().split(", ")));
        int lines = Integer.parseInt(scan.nextLine());
        for(int i=0; i<lines; i++) {
            String command = scan.nextLine();
            deck=processCommand(command, deck);
        }


        for(int i=0; i<deck.size(); i++){

            System.out.print( deck.get(i) + ((i!=deck.size()-1)?", ":""));
        }
        System.out.println();



    }
    public static List<String> processCommand(String command, List<String> list){
        String[] commandArr = command.split(", ");

        List<String> copyList = new ArrayList<>(List.copyOf(list));

        switch(commandArr[0]){
            case "Add":
                if(!copyList.contains(commandArr[1])){
                    copyList.add(commandArr[1]);
                    System.out.printf("Card successfully added%n");
                }else {
                    System.out.printf("Card is already in the deck%n");
                }
                break;
            case "Remove":
                if(copyList.contains(commandArr[1])){
                    copyList.remove(commandArr[1]);
                    System.out.println("Card successfully removed");
                }else {
                    System.out.println("Card not found");
                }
                break;
            case "Remove At":
                    if(Integer.parseInt(commandArr[1])>=0 && Integer.parseInt(commandArr[1])<copyList.size()){
                        copyList.remove(Integer.parseInt(commandArr[1]));
                        System.out.println("Card successfully removed");
                    }else {
                        System.out.println("Index out of range");
                    }

                break;

            case "Insert":
                if(Integer.parseInt(commandArr[1])>=0 && Integer.parseInt(commandArr[1])<copyList.size()){
                    if(!copyList.contains(commandArr[2])){
                        copyList.add(Integer.parseInt(commandArr[1]), commandArr[2]);
                        System.out.println("Card successfully added");

                    }else {
                        System.out.println("Card is already added");
                    }
                }else {
                    System.out.println("Index out of range");
                }
                break;
        }

        return copyList;
    }
}

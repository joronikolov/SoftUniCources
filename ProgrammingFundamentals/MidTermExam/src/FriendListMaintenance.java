import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> friendList = new ArrayList<>(Arrays.asList(scan.nextLine().split(", ")));
        String command = scan.nextLine();
        int[] scores = new int[2];

        while(!command.equals("Report")){
            friendList=processCommand(command, friendList, scores);


            command=scan.nextLine();
        }
        System.out.printf("Blacklisted names: %s%n", scores[0]);
        System.out.printf("Lost names: %s%n", scores[1]);
        for(int i=0; i<friendList.size(); i++){
            System.out.printf("%s ", friendList.get(i));
        }
        System.out.println();



    }
    public static List<String> processCommand(String command, List<String> list, int[] scores){
        String[] commandArr = command.split(" ");

        List<String> copyList = new ArrayList<>(List.copyOf(list));

        switch(commandArr[0]){
            case "Blacklist":
                if(copyList.contains(commandArr[1])){
                copyList.set(copyList.indexOf(commandArr[1]), "Blacklisted");
                scores[0]+=1;
                    System.out.printf("%s was blacklisted.%n", commandArr[1]);
                }else {
                    System.out.printf("%s was not found.%n", commandArr[1]);
                }
                break;
            case "Error":
                if(Integer.parseInt(commandArr[1])>=0 && Integer.parseInt(commandArr[1])<copyList.size() &&
                        !copyList.get(Integer.parseInt(commandArr[1])).equals("Blacklisted") &&
                        !copyList.get(Integer.parseInt(commandArr[1])).equals("Lost")
                ){
                    System.out.printf("%s was lost due to an error.%n", copyList.get(Integer.parseInt(commandArr[1])));
                    copyList.set(Integer.parseInt(commandArr[1]), "Lost");
                    scores[1]+=1;
                }
                break;
            case "Change":
                if(Integer.parseInt(commandArr[1])>=0 && Integer.parseInt(commandArr[1])<copyList.size()){
                    System.out.printf("%s changed his username to %s.%n", copyList.get(Integer.parseInt(commandArr[1])), commandArr[2]);
                    copyList.set(Integer.parseInt(commandArr[1]), commandArr[2]);
                }
                break;
        }

        return copyList;
    }
}

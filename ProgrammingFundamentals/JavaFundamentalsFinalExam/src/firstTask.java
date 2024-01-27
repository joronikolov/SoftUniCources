import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String spell = scan.nextLine();
        String[] command = scan.nextLine().split(" ");
        StringBuilder resultSpell = new StringBuilder();
        while(!command[0].equals("Abracadabra")){
            switch (command[0]){
                case "Abjuration":
                    spell=spell.toUpperCase();
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell=spell.toLowerCase();
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index=Integer.parseInt(command[1]);
                    if(index>=0 && index<spell.length()) {
                        String substituteLetter = command[2];
                        spell = spell.substring(0, index) + substituteLetter +spell.substring(index+1);
                        System.out.println("Done!");
                    }
                    else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    if(spell.contains(command[1])){
                        spell=spell.replaceAll(command[1], command[2]);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    if(spell.contains(command[1])) {
                        spell = spell.replaceAll(command[1], "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            command=scan.nextLine().split(" ");
        }

    }
}

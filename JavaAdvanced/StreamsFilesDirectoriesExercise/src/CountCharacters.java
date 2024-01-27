import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountCharacters {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.stream("a, e, i, o, u".split(", ")).map(e->e.toCharArray()[0]).collect(Collectors.toList()));
        Set<Character> punctuation = new HashSet<>(Arrays.stream("( ! , . ?".split("\\s")).map(e -> e.toCharArray()[0]).collect(Collectors.toList()));
        int vowSum=0;
        int punctSum=0;
        int otherSum=0;
        String path = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        try(FileReader fr = new FileReader(path);
        FileWriter fw = new FileWriter(outputPath);
        BufferedReader stream = new BufferedReader(fr);
        BufferedWriter outputStream = new BufferedWriter(fw);

        ){
        int oneByte = stream.read();
        while(oneByte>=0){
            char curChar=(char) oneByte;

            if (vowels.contains(curChar)){
                vowSum++;
            } else if (punctuation.contains(curChar)) {
                punctSum++;
            } else if (curChar!=' ' && curChar!='\r' && curChar!='\n') {
                otherSum++;
            }
            oneByte = stream.read();
        }
        outputStream.write(String.format("Vowels: %d%nOther symbols: %d%nPunctuation: %d%n", vowSum, otherSum, punctSum));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

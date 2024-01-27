import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class LineNumbers {
    public static void main(String[] args) {
        String path = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String outputPath = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\reult.txt";
        String checkPath = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        try(BufferedReader stream = Files.newBufferedReader(Paths.get(path)) ;
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath));

        ){
       // int nextByte = stream.read();
//        while(nextByte>=0){
//
//
//            nextByte = stream.read();
//        }


            String line= stream.readLine();
            int i=0;
            while (line != null){
                i++;
                writer.write(String.format("%d. %s%n", i, line));

                line= stream.readLine();
            }
        }
        catch(IOException f){
f.printStackTrace();
        }


    }
}

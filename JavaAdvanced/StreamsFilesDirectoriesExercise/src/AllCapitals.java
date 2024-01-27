import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader stream = Files.newBufferedReader(Paths.get(path));
            FileWriter fr = new FileWriter("C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        BufferedWriter writer = new BufferedWriter(fr);
        ){
            int oneByte = stream.read();




        while (oneByte>=0) {

            writer.write(Character.toUpperCase(oneByte));
            oneByte = stream.read();
        }



}

        catch(IOException f){
f.printStackTrace();
        }finally {

        }


    }
}

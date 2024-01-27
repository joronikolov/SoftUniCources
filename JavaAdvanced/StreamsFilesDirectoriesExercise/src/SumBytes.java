import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\joron\\Documents\\programming\\Java\\SoftUni\\JavaAdvanced\\StreamsFilesDirectoriesExercise\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader stream = Files.newBufferedReader(Paths.get(path)) ){
       // int nextByte = stream.read();
//        while(nextByte>=0){
//
//
//            nextByte = stream.read();
//        }


            String line= stream.readLine();
            int sum=0;
            while (line != null){

            int[] arr = Arrays.stream(line.split("")).mapToInt(e->{
                return (int) e.charAt(0);
            }).toArray();
                line= stream.readLine();
                for(int i : arr){
                    sum+=i;
                }


            }
            System.out.println(sum);
        }
        catch(IOException f){
f.printStackTrace();
        }


    }
}

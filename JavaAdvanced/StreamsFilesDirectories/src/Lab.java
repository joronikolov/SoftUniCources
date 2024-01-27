import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Lab {
    public static void main(String[] args) {
        String path = "C:\\Users\\joron\\Downloads\\test.txt";
        String outputPath = "C:\\Users\\joron\\Downloads\\test1.txt";
        Set<Character> punct = new HashSet<>();
        punct.add(',');
        punct.add('.');
        punct.add('!');
        punct.add('?');
        try (FileInputStream fileInputStream = new FileInputStream(path);
             FileOutputStream fileOutputStream= new FileOutputStream(outputPath)) {
            int oneByte = fileInputStream.read();

            while(oneByte>=0){
                if(!punct.contains((char) oneByte)) {
                    fileOutputStream.write(oneByte);
                }
//                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }
        }
        catch (IOException e){
            System.out.println("IO");
        }


    }
}

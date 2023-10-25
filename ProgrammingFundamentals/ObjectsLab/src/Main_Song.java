import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Song {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> playlist = new ArrayList<>();
        for (int i=0; i<n; i++){
            playlist.add(new Song(scan.nextLine()));
        }
        String search = scan.nextLine();
        for (Song s: playlist
             ) {
            if(s.getTypeList().equals((search.equals("all"))?s.getTypeList():search)){
                System.out.println(s.getName());
            }
        }

    }
}

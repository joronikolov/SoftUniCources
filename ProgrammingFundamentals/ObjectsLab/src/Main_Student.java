import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<Student> catalog = new ArrayList<>();
        while (!command.equals("end")){
            String[] arr = command.split(" ");
            catalog.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));
            command=scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student student : catalog
             ) {
            if(student.getHomeTown().equals(city)){
                System.out.print(student.getInfo());
            }

        }


    }
}

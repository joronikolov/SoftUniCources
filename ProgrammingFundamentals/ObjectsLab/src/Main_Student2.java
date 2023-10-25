import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Student2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        List<Student2> catalog = new ArrayList<>();
        while (!command.equals("end")){
            String[] arr = command.split(" ");
            boolean exists=false;
            for (Student2 s: catalog
                 ) {
                if(s.getFirstName().equals(arr[0]) && s.getLastName().equals(arr[1])){
                    int index=catalog.indexOf(s);
                    catalog.set(index, new Student2(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));
                    exists=true;
                }

            }
            if(!exists) {
                catalog.add(new Student2(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));
            }
            command=scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student2 student : catalog
             ) {
            if(student.getHomeTown().equals(city)){
                System.out.print(student.getInfo());
            }

        }


    }
}

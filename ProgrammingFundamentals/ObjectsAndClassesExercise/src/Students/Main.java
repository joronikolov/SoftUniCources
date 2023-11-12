package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        List<Student> studentList = new ArrayList<>();
        for(int i=0; i<lines;i++){
            String[] current = scan.nextLine().split(" ");
            studentList.add(new Student(current[0],current[1],  Double.parseDouble(current[2])));

        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade).reversed());

        studentList.forEach(s-> System.out.println(s.getInfo()));

    }
}

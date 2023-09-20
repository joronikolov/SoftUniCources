import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt();
        int first=0;
        int second=0;
        int third=0;
        int fail=0;
        double gradesSum=0;
        scan.nextLine();
        for(int i=1;i<=students;i++){
            double grade = scan.nextDouble();
            scan.nextLine();
            if(grade>=5){
                first++;
                
            } else if (grade>=4) {
                second++;
                
            } else if (grade>=3) {
                third++;
            }else {
                fail++;
            }

            gradesSum+=grade;
        }
        System.out.printf("Top students: %.2f%%%n", first*1.0/students*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", second*1.0/students*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", third*1.0/students*100);
        System.out.printf("Fail: %.2f%%%n", fail*1.0/students*100);
        System.out.printf("Average: %.2f%n", gradesSum*1.0/students);
    }
}

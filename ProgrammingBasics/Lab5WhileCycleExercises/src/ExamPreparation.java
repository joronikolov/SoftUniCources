import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limitBadGrades= scan.nextInt();
        scan.nextLine();
        String lastTaskName="";
        int sum=0;
        int badGrades=0;
        int numberOfProblems=0;
        while(true) {
            if(badGrades>=limitBadGrades){
                System.out.printf("You need a break, %d poor grades.", badGrades);
                break;
            }

            String currentTaskName=scan.nextLine();
            if(currentTaskName.equals("Enough")){
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", (double) sum/numberOfProblems, numberOfProblems,lastTaskName);
                break;
            }
            int grade = scan.nextInt();
            if(grade<=4){
                badGrades++;
            }
            sum+=grade;
            scan.nextLine();
            numberOfProblems++;
            lastTaskName=currentTaskName;

        }
    }
}

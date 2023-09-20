import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jurCount= scan.nextInt();
        scan.nextLine();
        int presentations=0;
        double sumAverageGrades=0;
        while(true) {
            double sumGrade = 0;
            String presentationName = scan.nextLine();
            if(presentationName.equals("Finish")){
                break;
            }
            presentations++;
            for(int i=1;i<=jurCount;i++){
                double grade= scan.nextDouble();
                scan.nextLine();
                sumGrade+=grade;
            }
            System.out.printf("%s - %.2f.%n",presentationName, sumGrade/jurCount);
            sumAverageGrades+=sumGrade/jurCount;
        }
        System.out.printf("Student's final assessment is %.2f.",sumAverageGrades/presentations);

    }
}

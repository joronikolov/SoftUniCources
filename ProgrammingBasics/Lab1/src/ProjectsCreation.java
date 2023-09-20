import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int hoursPerProject = 3;
        String architectName = scan.nextLine();
        int numberOfProjects = scan.nextInt();
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, numberOfProjects*hoursPerProject, numberOfProjects);
    }
}

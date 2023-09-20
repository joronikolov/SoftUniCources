import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int openedTabs = scan.nextInt();
        int salary = scan.nextInt();
        scan.nextLine();
        int remainingSalary=salary;
        Map<String, Integer> sites = new HashMap<>();
        sites.put("Facebook", 150);
        sites.put("Instagram" , 100);
        sites.put("Reddit" , 50);
        for(int i=0;i<openedTabs;i++){
            String site=scan.nextLine();
            if(sites.containsKey(site)){
                remainingSalary-=sites.get(site);
                if(remainingSalary<=0){
                    System.out.println("You have lost your salary.");
                    break;
                }
            }
        }
        if(remainingSalary>0) {
            System.out.println(remainingSalary);
        }
    }
}

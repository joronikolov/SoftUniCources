
import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        String command = scan.nextLine();
        while(!command.equals("End")){
            String[] commands = command.split(" -> ");
            if(companyEmployees.containsKey(commands[0])){
                boolean exists = false;
                for (String employee : companyEmployees.get(commands[0])
                ) {
                    if(employee.equals(commands[1])){
                        exists = true;
                    }
                }
                if(!exists){
                    companyEmployees.get(commands[0]).add(commands[1]);
                }
            }else{
                companyEmployees.put(commands[0], new ArrayList<>());
                companyEmployees.get(commands[0]).add(commands[1]);
            }
            command=scan.nextLine();
        }
        companyEmployees.forEach((k, v)->{
            System.out.println(k);
            v.forEach(l-> System.out.printf("-- %s%n", l));
        });

    }
}


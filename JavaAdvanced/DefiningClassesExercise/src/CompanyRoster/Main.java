package CompanyRoster;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employee> employees = new ArrayList<>();
        Set<Department> departments = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split("\\s+");
            Employee curEmployee = null;
            switch (command.length){
                case 6:
                    curEmployee=new Employee(command[0],
                            Double.parseDouble(command[1]),
                            command[2],
                            new Department(command[3]),
                            command[4],
                            Integer.parseInt(command[5]));
                    employees.add(curEmployee);
                    break;

                case 5:
                    if(command[4].contains("@")){
                        curEmployee=new Employee(command[0],
                                Double.parseDouble(command[1]),
                                command[2],
                                new Department(command[3]),
                                command[4]
                        );
                    }else {
                        curEmployee=new Employee(command[0],
                                Double.parseDouble(command[1]),
                                command[2],
                                new Department(command[3]),
                                Integer.parseInt(command[4])
                        );
                    }
                    employees.add(curEmployee);
                    break;
                case 4:
                    curEmployee=new Employee(command[0],
                            Double.parseDouble(command[1]),
                            command[2],
                            new Department(command[3])
                    );
                    employees.add(curEmployee);
                    break;
            }
            if (!departments.contains(curEmployee.getDepartment())){
                departments.add(new Department(curEmployee.getDepartment().getName()));
            }
            for(Department d : departments){
                if (d.getName().equals(curEmployee.getDepartment().getName())){
                    d.addEmployee(curEmployee);
                }
            }

        }

        Department department = null;
        double maxAvgSalary=Double.MIN_VALUE;
        for(Department d : departments){
            if(d.getAvgSale()>maxAvgSalary){
                department=d;
                maxAvgSalary=department.getAvgSale();
            }

        }
        System.out.println("Highest Average Salary: "+department.getName());
        for(Employee e : department.getEmployeeList().stream().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).collect(Collectors.toList())){
            System.out.println(e);
        }


    }
}

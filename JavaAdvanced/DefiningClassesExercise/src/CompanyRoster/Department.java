package CompanyRoster;

import java.util.LinkedList;
import java.util.List;

public class Department {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new LinkedList<>();
    }
    public double getAvgSale(){
        double sum =0;
        for(Employee e : employeeList){
            sum+=e.getSalary();
        }
        return sum/employeeList.size();
    }
    public boolean addEmployee(Employee employee){
        return employeeList.add(employee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return that.getName().equals(((Department) o).getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode()*31+name.hashCode();
    }
}

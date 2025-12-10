package Work.io;

import java.util.ArrayList;

public class HRManager extends Employee{

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void getEmployees(){

        for(Employee e:employees){
            System.out.println(e.getName());
            System.out.println(e.getSalary());
        }
    }
}

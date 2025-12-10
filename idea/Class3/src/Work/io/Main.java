package Work.io;

public class Main {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        Employee employee = new Employee();
        employee.setSalary(1000);
        employee.setName("John");
        hrManager.addEmployee(employee);

        hrManager.getEmployees();
    }
}

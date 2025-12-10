package Work.io;

public class Employee {
    private String name;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Work(){
        System.out.println("Working");
    }
    public double getSalary(){
        return salary;
    }

}

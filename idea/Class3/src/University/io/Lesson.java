package University.io;

public class Lesson implements printable {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstname("John");
        student.setLastname("Doe");
        student.setStudentcode("IO-2025");
        student.setGrade(30);
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        System.out.println(student.getStudentcode());
        System.out.println(student.getGrade());

        student.setGrade(80);

        double grade = student.calculate();

        student.info();
        System.out.println(grade);

    }

    @Override
    public void print() {
        System.out.println("Hello Students");
    }
}
interface printable{
    void print();
}

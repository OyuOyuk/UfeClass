package Animals;

public class Deer extends Animal {
    public Deer(int age, String name) {
        this.age = age;
        this.name = name;

    }
    @Override
    public void eat() {
        System.out.println("Deer eat");
    }
    @Override
    public void sleep() {
        System.out.println("Deer sleep");
    }
}

package Animals;

public abstract class Animal {
    protected int age;
    protected String name;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public abstract void eat();
    public abstract void sleep();
}

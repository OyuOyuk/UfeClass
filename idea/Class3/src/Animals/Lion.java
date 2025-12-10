package Animals;

public class Lion extends Animal {
    public Lion(int age, String name) {
        this.age = age;
        this.name = name;

    }
    public void roar(){
        System.out.println("roar");
    }
    @Override
    public void eat() {
        System.out.println("Lion eat");
    }
    @Override
    public void sleep() {
        System.out.println("Lion sleep");
    }
}

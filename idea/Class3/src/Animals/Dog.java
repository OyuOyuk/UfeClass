package Animals;

public class Dog extends Animal {


    private String breed;

    public Dog(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;

    }
    public String getBreed() {
        return breed;
    }
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }
}

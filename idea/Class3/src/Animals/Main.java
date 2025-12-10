package Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(4, "Lilo", "Golden Retriever");
        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getBreed());

        dog.eat();
        dog.sleep();
        Lion lion = new Lion(8,"Sal");
        lion.eat();
        lion.sleep();
        lion.roar();
        Deer deer = new Deer(5, "Bambi");
        deer.eat();
        deer.sleep();
    }
}

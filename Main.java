import Inheritance.*;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Dog");
        Cat cat = new Cat("Whiskers", "Cat");
        dog.speak();
        dog.bark();
        cat.speak();
        cat.meow();
    }
}
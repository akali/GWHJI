package week5.examples.abstract_classes.zoo;

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat("Sundae");
        Animal b = new Dog("Hughes");
        Animal[] zoo = new Animal[]{a, b};

        for (int i = 0; i < zoo.length; ++i) {
            Animal current = zoo[i];
            current.makeSound();
        }
    }
}

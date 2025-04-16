package week5.examples.abstract_classes.zoo;

public abstract class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();
}

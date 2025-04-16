package week5.examples.abstract_classes.zoo;

public class Dog extends DomesticAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " woofs!");
    }
}

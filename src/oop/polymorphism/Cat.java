package oop.polymorphism;

public class Cat extends Animal{

    public boolean cleanCat ;

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

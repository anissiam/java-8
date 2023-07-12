package oop.polymorphism;

public class Main {
    public static void main(String[] args) {

        doTest(new Addition(), 10, 50);
        doTest(new Concat(), 10, 50);

        /*Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
*/
        /*Cat cat = new Cat();
        Poly poly = new Poly();
        poly.makePoly(cat);

        Animal dog = new Dog();
        poly.makePoly(dog);
*/



    }

    /*public static void makePoly(Animal animal) {
        animal.makeSound();
    }*/


    public static void doTest(Test test, int x, int y) {
        test.makeTest(x, y);
    }
}

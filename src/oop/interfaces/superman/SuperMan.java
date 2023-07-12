package oop.interfaces.superman;

public class SuperMan extends Person implements SuperHero {
    public SuperMan() {
    }

    public SuperMan(String name, String gender, int age, Address address) {
        super(name, gender, age, address);
    }

    @Override
    public void power(String power) {
        System.out.println(power);
    }

}

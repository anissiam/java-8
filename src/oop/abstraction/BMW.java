package oop.abstraction;

public class BMW extends Car{
    public BMW() {
    }

    public BMW(String name, String model, int speed) {
        super(name, model, speed);
    }

    @Override
    public String printSpeed() {
        return speed + " MPH";
    }
}

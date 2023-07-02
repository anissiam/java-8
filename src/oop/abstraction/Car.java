package oop.abstraction;

public abstract class Car {
    String name;
    String model;
    int speed;

    public Car() {
    }

    public Car(String name, String model, int speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
    }

    public abstract String printSpeed();

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}

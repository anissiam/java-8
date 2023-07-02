package oop.abstraction;

public class KIA extends Car{
    public KIA() {
    }

    public KIA(String name, String model, int speed) {
        super(name, model, speed);
    }

    @Override
    public String printSpeed() {
        return speed + " KMPH";
    }
}

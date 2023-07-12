package oop.interfaces.homework;

public class CarV1 extends Car implements CarSolar{
    public CarV1() {
    }

    public CarV1(boolean remoteControl, int batterySize, int carSpeed) {
        super(remoteControl, batterySize, carSpeed);
    }

    @Override
    public void addChargeableCar() {
        System.out.println("Added");
    }

    @Override
    public int addSolarPanel(int solar) {
        return solar;
    }
}

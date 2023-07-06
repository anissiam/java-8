package oop.interfaces.homework;

public class Car {
    private boolean remoteControl;
    private int batterySize;
    private int carSpeed;

    public Car() {
    }

    public Car(boolean remoteControl, int batterySize, int carSpeed) {
        this.remoteControl = remoteControl;
        this.batterySize = batterySize;
        this.carSpeed = carSpeed;
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "remoteControl=" + remoteControl +
                ", batterySize=" + batterySize +
                ", carSpeed=" + carSpeed +
                '}';
    }
}

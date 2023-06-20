package oop.basics;

public class MyCar {
    String name;
    String color;
    double maxSpeed;

    public MyCar() {

    }

    public MyCar(String name, String color, double maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void printCar(){
        System.out.println("Car:[Name:" + name + " Color:" + color + " Max Speed:" + maxSpeed + "]");
    }

    public void updateMaxSpeed(double speed){
        maxSpeed = speed;
    }

    public void printSpeed() {

        for (int i = 0; i < maxSpeed; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

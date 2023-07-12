package oop.basics;

public class Car {
    String name;
    String color;
    int speed;

    public void printCar() {
        System.out.println("Name : " + name + " Color :  " + color + " Speed " + speed);

    }

    public void printSpeed() {

        for (int i = 0; i < speed; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

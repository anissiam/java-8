package oop.interfaces.homework;

public class Main {
    public static void main(String[] args) {
        CarV1 v1 = new CarV1(true , 20 ,30 );
        v1.addChargeableCar();
        System.out.println(v1.addSolarPanel(2));
        System.out.println(v1.toString());

    }
}

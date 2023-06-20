package oop.enc;

public class MyCar {
    private String name;
   private String color;
    private double maxSpeed;
    private int salary;
    public MyCar() {

    }

    public MyCar(String name, String color, double maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
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

package oop.inhr.superman;

public class SuperHero extends Person{
    //SuperHero
   private String power;

    public void getPower(){
        System.out.println(power);
    }

    public void setPower(String power) {
        this.power = power;
    }
}

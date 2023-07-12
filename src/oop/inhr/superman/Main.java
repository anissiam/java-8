package oop.inhr.superman;

public class Main {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        superMan.name = "Clark";
        superMan.age = 10000;
        superMan.setPower("Fly");
        superMan.printSuperman();


        Anis anis = new Anis();
        anis.name = "Anis";
        anis.printPerson();

    }
}

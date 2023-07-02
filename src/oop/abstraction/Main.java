package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "2020", 300);
        System.out.println(bmw.printSpeed());


        KIA kia = new KIA("KIA", "2019", 250);
        System.out.println(kia.toString());
        System.out.println(kia.printSpeed());
        ////////////////////////////////////////////////////

        /*School school = new School("Ali", 5, 70.0);
        System.out.println(school.checkTotal());
        System.out.println(school.toString());
        school.checkAge();

        Collage collage = new Collage("Sami", 20, 55.0);
        System.out.println(collage.checkTotal());
        System.out.println(collage.toString());
        collage.checkAge();*/
    }
}

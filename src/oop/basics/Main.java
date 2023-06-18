package oop.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Shape shape = new Shape();
        shape.width = 10;
        shape.height = 50;

        System.out.println(shape.area());


        Shape shape1 = new Shape();
        shape1.width = 5;
        shape1.height = 3;

        System.out.println(shape1.area());


        Car ford = new Car();
        ford.name = "Ford";
        ford.color = "Blue";
        ford.speed = 150;


        ford.printCar();
        ford.printSpeed();


        /////////////////////////////////////////////////////////////
        Person obj = new Person(); // Instance // Create object
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.tall);
        System.out.println(obj.gender);
        obj.name = "anis";
        System.out.println(obj.name);
        obj.printFood();
        System.out.println(obj.food);

       /* System.out.println("Plz enter the Food");
        String food = scanner.nextLine();
        obj.inputFood(food);*/

        obj.printFood();


        obj.inputFood();

        obj.printFood();

        ///////////////////////////////////////////

        Person obj1 = new Person();
        System.out.println(obj1.name);
        obj1.name = "sami";
        System.out.println(obj1.name);
        obj1.printFood();

        /*String name;
        int age;
        double tall;
        char gender;


        String name1;
        int age1;
        double tall1;
        char gender1;*/
    }
}

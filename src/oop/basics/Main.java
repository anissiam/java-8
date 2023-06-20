package oop.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCar myCar = new MyCar();

        System.out.println("Plz enter the car name");
        String name = scanner.nextLine();
        myCar.name = name;

        System.out.println("Plz enter the car Color");
        String color = scanner.nextLine();
        myCar.color = color;


        System.out.println("Plz enter the car Max speed");
        double maxSpeed = scanner.nextDouble();
        myCar.maxSpeed = maxSpeed;

        myCar.printCar();


        MyCar myCar1 = new MyCar("KIA" , "White"  , 350);

        myCar1.printCar();

        myCar1.color = "RED";

        myCar1.printCar();

        //////////////////////////////////////////////////////////
        /*Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
       *//* shape.width = 10;
        shape.height = 50;*//*
        System.out.println(shape.area());

        int width = scanner.nextInt();
        Shape shape1 = new Shape(width,50,"rectangle");

        System.out.println(shape1.printData());


        Shape shape2 = new Shape("rectangle");
        System.out.println(shape2.name);
        shape2.changeName("anis");
        System.out.println(shape2.name);*/

       /* Scanner scanner = new Scanner(System.in);


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
*/

        /////////////////////////////////////////////////////////////
        /*Person obj = new Person(); // Instance // Create object
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.tall);
        System.out.println(obj.gender);
        obj.name = "anis";
        System.out.println(obj.name);
        obj.printFood();
        System.out.println(obj.food);*/

       /* System.out.println("Plz enter the Food");
        String food = scanner.nextLine();
        obj.inputFood(food);*/

        /*obj.printFood();


        obj.inputFood();

        obj.printFood();
*/
        ///////////////////////////////////////////
/*
        Person obj1 = new Person();
        System.out.println(obj1.name);
        obj1.name = "sami";
        System.out.println(obj1.name);
        obj1.printFood();*/

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

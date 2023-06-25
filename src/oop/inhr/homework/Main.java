package oop.inhr.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("H:");
        int h = scanner.nextInt();

        System.out.print("W:");
        int w = scanner.nextInt();
        Squre squre = new Squre(h,w);
        System.out.println(squre.area());
        System.out.println(squre.toString());
        /*System.out.println(squre.par());
        squre.printData();*/


        Circle circle = new Circle(10);
        System.out.println(circle.par());
        System.out.println(circle.area());
        circle.printData();

    }
}

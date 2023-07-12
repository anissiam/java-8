package oop.basics;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    double tall;
    char gender;

    String food = "apple";

    public void printFood(){
        System.out.println(food);
    }

    public void inputFood(String food1){
        food = food1;
    }

    public void inputFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the Food");
         food = scanner.nextLine();
    }

}
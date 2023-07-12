package oop.exception;

import oop.basics.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Person person ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{


            System.out.println("Plz enter the num");

            int x = scanner.nextInt(); // Throw
            System.out.println(x);

            x = x / 0;

            person.printFood();//throw
        }catch (InputMismatchException e){
            System.out.println(e);
            return;
        }catch (NullPointerException e){
            System.out.println(e);
            person = new Person();
            person.printFood();
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }


        System.out.println("Done");

    }
}

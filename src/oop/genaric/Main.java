package oop.genaric;

import basics.Project;
import oop.basics.Person;
import oop.polymorphism.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        NumberGCLass<Cat> integerNumberGCLass = new NumberGCLass<>(cat);
        integerNumberGCLass.print();

        GClass<Integer> integerGClass = new GClass<Integer>(50);
        integerGClass.print();

        GClass<String> stringGClass = new GClass<>("Sami");
        stringGClass.print();



        GClass<Object> gClass = new GClass<>(new Person());
        gClass.print();


        System.out.println(genatateT(new Cat()).cleanCat);

        GCLass1<Integer, Object> integerObjectGCLass1 = new GCLass1<>();

        /*IntegerClass integerClass = new IntegerClass(50);
        integerClass.print();


        StringClass stringClass = new StringClass("Anis");
        stringClass.print();

        DoubleClass doubleClass = new DoubleClass(50.5);
        doubleClass.print();*/

    }

    private static <T> T genatateT(T t){
        return t;
    }
}

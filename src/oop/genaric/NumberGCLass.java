package oop.genaric;

import oop.polymorphism.Animal;

public class NumberGCLass <Whatever extends Animal>{

    Whatever toPrint;

    public NumberGCLass(Whatever toPrint) {
        this.toPrint = toPrint;
    }
    public void print( ) {
        System.out.println(toPrint);
    }

}

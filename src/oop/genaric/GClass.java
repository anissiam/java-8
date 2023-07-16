package oop.genaric;

public class GClass<T> {
    T toPrint;

    public GClass(T toPrint) {
        this.toPrint = toPrint;
    }
    public void print( ) {
        System.out.println(toPrint);
    }



}

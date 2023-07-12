package oop.inhr.homework;

public class Circle extends Shape{
    final double PI = 3.14;
    public Circle(){
        super();
    }

    public Circle(int rad) {
        super(rad);
    }

    @Override
    public double area(){
        return PI*(rad*rad);
    }
    @Override
    public double par(){//المحيط
        return 2 * PI * rad;
    }
}

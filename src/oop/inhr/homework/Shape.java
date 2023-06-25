package oop.inhr.homework;

public class Shape {
     int height;
     int width;
     int rad;
    public Shape() {
    }

    public Shape(int rad) {
        this.rad = rad;
    }

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Shape(int height, int width, int rad) {
        this.height = height;
        this.width = width;
        this.rad = rad;
    }
    public void printData(){
        System.out.println("H:" + height + " W:" +
                width  + " R:" + rad);
    }
    public double area(){
        return 0.0;
    }

    public double par(){//المحيط
        return 0.0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                ", rad=" + rad +
                '}';
    }
}

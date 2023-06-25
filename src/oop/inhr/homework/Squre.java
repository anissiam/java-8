package oop.inhr.homework;

public class Squre extends Shape {

    public Squre(int height, int width) {
        super(height, width);
    }

    @Override
    public void printData() {
        System.out.println("H:" + height + " W:" + width);
    }

    @Override
    public double area() {
        super.printData();

        return height * width;
    }

    @Override
    public double par() {
        return 4 * height;
    }
    /*  public void printData(){
        System.out.println("H:" + height + " W:" + width);
    }

    public int area(){
        return height * width;
    }

    public int par(){//المحيط
        return 4*height;
    }*/

}

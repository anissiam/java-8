package oop.basics;

public class Shape {
    int width;
    int height;

    String name;

    public Shape(){
     System.out.println("Shape");
    }

    public Shape (String name){
        this.name = name;
    }
    public Shape(int width , int height , String name){
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public void changeName(String name){
        this.name = name;
    }
    public int area(){
        int result = width * height;
        return result;
    }

    public String printData(){
        return "Width: " + width + " Height: " + height + " Name:" + name;
    }
}

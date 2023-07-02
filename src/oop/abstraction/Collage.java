package oop.abstraction;

public class Collage extends Student{
    public Collage(String name, int age, double total) {
        super(name, age, total);
    }

    @Override
    protected String checkTotal() {
        String result = "";
        if(getTotal()>60){
            result = "Success";
        }else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public void checkAge() {
        if(getAge()<20){
            System.out.println("1");
        }else {
            System.out.println("2,3,4");
        }
    }


}

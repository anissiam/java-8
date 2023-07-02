package oop.abstraction;

import java.sql.Struct;

public class School extends Student{
    public School(String name, int age, double total) {
        super(name, age, total);
    }

    @Override
    protected String checkTotal() {
        String result = "";
        if(getTotal()>50){
            result = "Success";
        }else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public void checkAge() {
        if(getAge()<6){
            System.out.println("Not Valid");
        }else {
            System.out.println("Valid");
        }
    }
}

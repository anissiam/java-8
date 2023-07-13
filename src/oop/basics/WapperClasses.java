package oop.basics;

import java.util.ArrayList;

public class WapperClasses {
    public static void main(String[] args) {
        System.out.println(Integer.compress(10, 50));
        int x = 10;

        "adsadsa".getBytes();

        System.out.println(x);

        Integer i = new Integer("10");
        Integer ii = Integer.valueOf("10");
        try {
            double iii= Double.parseDouble("sami");

        }catch (NumberFormatException e){
            System.out.println(e);
        }

        System.out.println(i.byteValue());
        System.out.println(i.toString());
        System.out.println(Integer.compare(20, 20));
        System.out.println(Integer.max(10, 50));
        System.out.println(Integer.min(10, 50));

        System.out.println(Math.max(10, 50));
        System.out.println((int)(Math.random()*100));
        System.out.println((Math.pow(2, 2)));
        System.out.println((Math.round(5.9)));
        System.out.println((Math.floor(5.9)));
        System.out.println((Math.ceil(5.9)));
        System.out.println(Math.abs(-10));
        System.out.println(Math.cos(45));


    }
}

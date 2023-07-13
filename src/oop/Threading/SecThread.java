package oop.Threading;

import oop.basics.Person;

public class SecThread implements Runnable {
    private String name;
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package oop.Threading;

public class FirstThread extends Thread{
    @Override
    public void run() {
        super.run();
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


}

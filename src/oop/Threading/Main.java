package oop.Threading;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }).start();

       /* SecThread secThread = new SecThread();
        secThread.setName("T1");
        Thread thread = new Thread(secThread);

        thread.start();

        SecThread secThread1 = new SecThread();
        secThread1.setName("T2");
        Thread thread1 = new Thread(secThread1);

        thread1.start();*/

        /*FirstThread firstThread = new FirstThread();
        //firstThread.setPriority(Thread.MIN_PRIORITY);

        firstThread.start();
        try {
            firstThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        FirstThread firstThread1 = new FirstThread();
        //firstThread1.setPriority(Thread.MAX_PRIORITY);

        firstThread1.start();
*/



        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
    }
}

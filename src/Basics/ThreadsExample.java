package Basics;

//public class Thread implements Runnable
class AThread implements Runnable {
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("Thread A: " + i);
        }
    }
}

class BThread extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsExample {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        BThread t2 = new BThread();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);



        t1.run();
        t2.start();
    }
}

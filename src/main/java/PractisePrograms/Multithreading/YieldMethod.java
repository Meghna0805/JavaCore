package PractisePrograms.Multithreading;

public class YieldMethod extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "is running...");
            Thread.yield();

        }

    }
    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod();
        YieldMethod t2 = new YieldMethod();
        t1.start();
        t2.start();
    }
}

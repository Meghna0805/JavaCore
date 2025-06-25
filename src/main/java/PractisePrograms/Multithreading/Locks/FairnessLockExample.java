package PractisePrograms.Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task,"Thread1");
        Thread t2 = new Thread(task,"Thread2");
        Thread t3 = new Thread(task,"Thread3");

        t1.start();
        t2.start();
        t3.start();


    }
}

package PractisePrograms.Collections.Vectors;

import java.util.Vector;

public class ThreadSafeVectors {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<Integer>();

        Runnable task = ()-> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        };
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task);

        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("Expected size: 2000, Actual size: "+vector.size());
    }
}
//Vector is thread safe  as it is synchronised, but it is slow at the same time due to locking  and overhead
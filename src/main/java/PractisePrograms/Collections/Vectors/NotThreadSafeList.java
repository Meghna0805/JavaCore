package PractisePrograms.Collections.Vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotThreadSafeList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<Integer>();

        Runnable task = ()->{
            for(int i=0; i<1000; i++){
                list.add(i);
            }
        };
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("Expected size: 2000, Actual size: "+list.size());

    }
}

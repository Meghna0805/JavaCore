package PractisePrograms.Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicKeyword {
    public class VolatileCounter {
        private AtomicInteger counter = new AtomicInteger(0);

        public void increment() {
            counter.incrementAndGet();
        }

        public int getCounter() {
            return counter.get();
        }

        public void main(String[] args) throws InterruptedException {
            VolatileCounter vc = new VolatileCounter();
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    vc.increment();
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    vc.increment();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(vc.getCounter());
        }

    }
}

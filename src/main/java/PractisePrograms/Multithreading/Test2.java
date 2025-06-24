package PractisePrograms.Multithreading;

public class Test2 {
    public static void main(String[] args){
        newThreadUsingRunnableInterface world = new newThreadUsingRunnableInterface();
        Thread t1 = new Thread(world);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

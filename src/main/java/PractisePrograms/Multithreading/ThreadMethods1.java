package PractisePrograms.Multithreading;

public class ThreadMethods1 extends Thread {
    public ThreadMethods1(String name) {
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread is running..");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName()+"- Priority"+ Thread.currentThread().getPriority() + "- count" + i);
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadMethods1 t1 = new ThreadMethods1("Low Priority Thread");
        ThreadMethods1 t2 = new ThreadMethods1("Medium Priority Thread");
        ThreadMethods1 t3 = new ThreadMethods1("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
    }
}
package PractisePrograms.Multithreading;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        DaemonThread dt2 = new DaemonThread();
        dt2.start();
        dt.start();
        System.out.println("Main Done");
    }

}

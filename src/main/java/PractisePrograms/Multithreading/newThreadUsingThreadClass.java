package PractisePrograms.Multithreading;

public class newThreadUsingThreadClass extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("World");
        }
    }
}

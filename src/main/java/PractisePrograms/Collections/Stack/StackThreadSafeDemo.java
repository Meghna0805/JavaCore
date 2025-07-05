package PractisePrograms.Collections.Stack;

import java.util.Stack;

public class StackThreadSafeDemo {
    static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                stack.push(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1000;i<2000;i++){
                stack.push(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Stack size should be 200, actual: "+stack.size());
    }
}

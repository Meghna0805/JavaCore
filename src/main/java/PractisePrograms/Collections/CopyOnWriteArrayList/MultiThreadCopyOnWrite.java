package PractisePrograms.Collections.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreadCopyOnWrite {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Milk");
        list.add("Eggs");
        list.add("Sandwich");

        Runnable reader = ()-> {
            for(String s : list){
                System.out.println("Reading: "+s);
                try{
                    Thread.sleep(1000); //simulate reading time
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable writer = ()-> {
            try{
                Thread.sleep(2000); //wait befor writing
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            list.add("Butter");
            System.out.println("New Item Added");
        };

        Thread t1 = new Thread(reader);
        Thread t2 = new Thread(writer);
        t1.start();
        t2.start();
    }
}

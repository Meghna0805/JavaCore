package PractisePrograms.Collections.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        //Add elements
        list.add("Milk");
        list.add("Bread");
        list.add("Cheese");
        list.add("Milk");

        //Iterate and modify inside loop
        for (String s : list) {
            System.out.println("Reading: "+s);
            if(s.equals("Milk")){
                list.add("Eggs"); //Modify while iterating
            }
        }
        System.out.println("Updated List: "+list);
    }
}

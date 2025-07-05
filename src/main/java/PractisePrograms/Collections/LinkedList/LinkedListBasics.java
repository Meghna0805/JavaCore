package PractisePrograms.Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Initial List : " + list);

        //Add at first and last Index
        list.addFirst("A+");
        list.addLast("H");
        System.out.println("List after adding at first and last : " + list);

        //Get First and Last
        System.out.println("First element : " + list.getFirst());
        System.out.println("Last element : " + list.getLast());

        //Remove  first and last
        list.removeFirst();
        list.removeLast();
        System.out.println("List after removing first and last  elements : " + list);

        //Insert at middle index
        list.add(1, "A++");
        System.out.println("List after inserting at 1 index : " + list);

        //Removing using if condition
        list.add( "B++");
        list.add( "C++");
        list.add( "D++");
        System.out.println("Updated List : " + list);

        //Remove elements that have ++ in them
        list.removeIf(s->s.contains("++"));
        System.out.println("List after removing if contains '++' : " + list);

        list.add( "B++");
        list.add( "C++");
        list.add( "D++");
        System.out.println("Updated List : " + list);

        //remove Common elements
        LinkedList<String> toRemove = new LinkedList<>(List.of("A++","B++","C++","D++"));
        list.removeAll(toRemove);
        System.out.println("List after removing common elements : "+list);

        //Using LinkedList as Stack
        LinkedList<String> stack = new LinkedList<>();
        stack.push("Krishna");
        stack.push("Ram");
        stack.push("Sita");
        stack.push("Radha");
        stack.push("Hilo");
        System.out.println("Stack (LIFO) : " + stack);
        stack.pop();//Removes Hilo
        System.out.println("Stack (POP) : " + stack);

        //Using Linked List As Queue
        LinkedList<String> queue = new LinkedList<>();
        queue.add("BYEBYE");
        queue.add("Krishna");
        queue.add("Ram");
        queue.add("Sita");
        queue.add("Radha");
        System.out.println("Queue (LIFO) : " + queue);
        queue.poll();//Remove  BYEBYE
        System.out.println("Queue (POP) : " + queue);



    }
}


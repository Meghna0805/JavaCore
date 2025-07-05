package PractisePrograms.Collections.Stack;

import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        //Pushing to end of  list(like stack push)
        stack.addLast(10);
        stack.addLast(20);
        stack.addLast(30);
        System.out.println("LinkedList as Stack: "+stack);

        //Peeking last
        System.out.println("Peek: "+stack.getLast());

        //Popping last
        System.out.println("Popped: "+stack.removeLast());

        //After pop
        System.out.println("After removing last: "+stack);
    }
}

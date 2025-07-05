package PractisePrograms.Collections.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();

        //Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);

        System.out.println("Initial stack: "+stack);

        //Peeking Top
        System.out.println("Top element: "+stack.peek());

        //Popping Top
        System.out.println("Poped element: "+stack.pop());
        System.out.println("Stack after pop(): "+stack);

        //Check if empty
        System.out.println("Is stack empty: "+stack.isEmpty());

        //Search for element
        System.out.println("Position of  20 from top: "+stack.search(20));
        System.out.println("Position of 100 from top: "+stack.search(100)); // -1 means  not present

    }
}

package PractisePrograms.Collections.Stack;

import java.util.ArrayList;

public class ArrayListAsStack {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();

        //Push = add to end
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println(stack);

        //Peek
        int top = stack.get(stack.size()-1);
        System.out.println("Peek: "+top);

        //Pop
        stack.remove(stack.size()-1);
        System.out.println("After Popping: "+stack);
    }
}

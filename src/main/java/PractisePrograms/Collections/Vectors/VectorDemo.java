package PractisePrograms.Collections.Vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> students = new Vector<>(); //Default capacity is 10
        System.out.println("Initial capacity : " + students.capacity());

        for(int i = 1; i<15; i++){
            students.add(i);
        }
        System.out.println("After adding elements" + students);
        System.out.println("New capacity : " + students.capacity());//it is doubled, therefore it should be 20

        //Custom capacity and Increment
        Vector<Integer> customVector = new Vector<>(5,3);
        System.out.println("Initial capacity of customVector : " + customVector.capacity());
        for(int i =1; i<=6; i++){
            customVector.add(i);
        }
        System.out.println("Custom Vector : "+ customVector);
        System.out.println("Capacity after overflow : "+ customVector.capacity());

        //Create Vector from Collection
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Vector<Integer> CollectionVector = new Vector<>(list);

        System.out.println("Vector from Collection : "+ CollectionVector);

    }
}

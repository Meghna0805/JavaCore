package PractisePrograms.Collections.Vectors;

import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("John");
        names.add("Jane");
        names.add(1,"Bob");

        System.out.println("Names in Vector : "+ names);
        System.out.println("Get index 2: "+names.get(2));

        names.set(1, "David");
        System.out.println("After set : "+ names);

        names.remove("David");
        System.out.println("After remove : "+ names);
        System.out.println("Size: "+names.size());
        System.out.println("Is empty : "+ names.isEmpty());
        System.out.println("Contains Alice : "+names.contains("Alice"));

        names.clear();
        System.out.println("After clear : "+ names);
    }
}

package PractisePrograms.Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Create a Hashmap to store student roll no. and name
        HashMap<Integer, String> students = new HashMap<>();

        //Add entries(put)
        students.put(1, "Akshit");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        //Print the entire map
        System.out.println("Students  map: "+students);

        //Get value by key
        String name = students.get(3);
        System.out.println("Student with roll number 3: "+name);

        //Check if a value exists
        System.out.println("Contains roll number 2? "+students.containsKey(2));

        //Check if a value exists
        System.out.println("Contains name 'Akshit'?" + students.containsValue("Akshit"));


        //Iterate using keySet
        System.out.println("Iterating using keySet()");
        for(Integer key : students.keySet()){
            System.out.println("Key: "+key+" Value: "+students.get(key));
        }

        //Iterate using entrySet
        System.out.println("Iterating using entrySet(): ");
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());

        }

        //Remove entry by key
        students.remove(3);
        System.out.println("After removing roll no. 3: "+students);

        //Replace  value for a key
        students.replace(2,"Mehul");
        System.out.println("After replacing roll no. 2: "+students);
    }
}

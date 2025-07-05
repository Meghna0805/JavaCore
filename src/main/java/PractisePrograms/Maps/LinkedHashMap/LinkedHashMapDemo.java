package PractisePrograms.Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //Creating a LinkedHashMap with Insertion Order
        LinkedHashMap<String, Integer> fruitMap = new LinkedHashMap<String, Integer>();
        fruitMap.put("Apple", 50);
        fruitMap.put("Banana", 20);
        fruitMap.put("Orange", 40);

        //Printing the map (Insertion Order is maintained)
        System.out.println("Insertion Order: ");
        for(Map.Entry<String, Integer> entry : fruitMap.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        //Create LinkedHashMap with access order
        LinkedHashMap<String, Integer> accessMap = new LinkedHashMap<>(16, 0.75f, true);
        accessMap.put("Apple", 50);
        accessMap.put("Banana", 20);
        accessMap.put("Orange", 40);

        //Access some Keys
        accessMap.get("Apple");
        accessMap.get("Banana");

        //Print Access Order
        System.out.println("\nAccess Order: ");
        for(Map.Entry<String, Integer> entry : accessMap.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}

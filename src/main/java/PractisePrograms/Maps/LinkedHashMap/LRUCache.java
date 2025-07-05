package PractisePrograms.Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    //Override to remove least recently used item

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;

    }

    public static void main(String[] args) {
        LRUCache<String, Integer> cache = new LRUCache<String, Integer>(3);

        cache.put("Amy", 10);
        cache.put("Billu", 20);
        cache.put("Chiku", 35);
        System.out.println("Cache after 3 inserts: "+cache);

        cache.get("Amy");
        cache.put("Piku", 80);//Adds Vipul
        System.out.println("Cache after accessing Amy and Piku: "+cache);

        cache.put("Billu", 100); //Reinserted Billu now  oldest is  Chiku
        System.out.println("Final Cache: "+cache);
    }
}

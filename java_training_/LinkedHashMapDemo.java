package java_training_;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");
        map.put(104, "David");

        map.put(102, "Robert"); 

        System.out.println("Initial LinkedHashMap: " + map);
        System.out.println("Size of map: " + map.size());

        System.out.println("Value for key 103: " + map.get(103));
        System.out.println("Value for non-existent key 105: " + map.get(105));
        System.out.println("Get with Default (105): " + map.getOrDefault(105, "Not Found"));

        System.out.println("Contains key 101?: " + map.containsKey(101));
        System.out.println("Contains value 'Charlie'?: " + map.containsValue("Charlie"));
        System.out.println("Is map empty?: " + map.isEmpty());

        System.out.println("Iterating through Key-Value Pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        map.remove(104); 
        System.out.println("After removing key 104: " + map);

        map.clear();
        System.out.println("After clear() operation: " + map);
        System.out.println("Is map empty now?: " + map.isEmpty());
    }
}

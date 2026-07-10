package java_training_;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Charlie", 85);
        map.put("Alice", 95);
        map.put("David", 70);
        map.put("Bob", 90);

        map.put("Bob", 92); 

        System.out.println("Initial TreeMap (Sorted by Key): " + map);
        System.out.println("Size of map: " + map.size());

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        System.out.println("Floor key for 'Calvin': " + map.floorKey("Calvin"));
        System.out.println("Ceiling key for 'Calvin': " + map.ceilingKey("Calvin"));
        System.out.println("Higher key than 'Charlie': " + map.higherKey("Charlie"));
        System.out.println("Lower key than 'Charlie': " + map.lowerKey("Charlie"));

        System.out.println("SubMap ('Alice' to 'David', exclusive): " + map.subMap("Alice", "David"));
        System.out.println("HeadMap (Keys < 'Charlie'): " + map.headMap("Charlie"));
        System.out.println("TailMap (Keys >= 'Charlie'): " + map.tailMap("Charlie"));

        System.out.println("Iterating through sorted Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        map.remove("David");
        System.out.println("After removing 'David': " + map);

        Map.Entry<String, Integer> polledEntry = map.pollFirstEntry();
        System.out.println("Polled First Entry: " + polledEntry);
        System.out.println("Final TreeMap: " + map);
    }
}

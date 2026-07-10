package java_training_;

import java.util.*;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

       
        set.add("Mango");
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        
        set.add("Apple"); 

        System.out.println("Initial LinkedHashSet: " + set);
        System.out.println("Size of set: " + set.size());

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains 'Apple'?: " + containsApple);
        System.out.println("Is the set empty?: " + set.isEmpty());

        System.out.println("Iterating using enhanced for-loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        set.clear();
        System.out.println("After clear() operation: " + set);
        System.out.println("Is the set empty now?: " + set.isEmpty());
    }
}
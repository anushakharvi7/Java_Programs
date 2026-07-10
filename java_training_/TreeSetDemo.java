package java_training_;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        
        numbers.add(20); 

        System.out.println("Initial TreeSet (Sorted): " + numbers);
        System.out.println("Size of set: " + numbers.size());

        System.out.println("Lowest/First Element: " + numbers.first());
        System.out.println("Highest/Last Element: " + numbers.last());

        System.out.println("Floor of 25 (<= 25): " + numbers.floor(25));
        System.out.println("Ceiling of 25 (>= 25): " + numbers.ceiling(25));
        System.out.println("Higher than 30 (> 30): " + numbers.higher(30));
        System.out.println("Lower than 20 (< 20): " + numbers.lower(20));

        System.out.println("Contains 30?: " + numbers.contains(30));
        
        System.out.println("Iterating in Descending Order:");
        Iterator<Integer> descIterator = numbers.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }

        System.out.println("SubSet (10 to 30, exclusive): " + numbers.subSet(10, 30));
        System.out.println("HeadSet (Elements < 30): " + numbers.headSet(30));
        System.out.println("TailSet (Elements >= 20): " + numbers.tailSet(20));

        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);
        
        System.out.println("Polled First Element: " + numbers.pollFirst()); 
        System.out.println("Final TreeSet: " + numbers);
    }
}
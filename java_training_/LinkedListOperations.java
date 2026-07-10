package java_training_;

import java.util.*;
public class LinkedListOperations {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList();
		a.add(10);
		a.add(20);
		a.add(18);
		a.add(40);
		//a.add("Sam");
		//System.out.println(a);
		a.add(1,50);
		//System.out.println(a);
		
		
		LinkedList b = new LinkedList();
		b.add("Virat");
		b.add(18);
		b.add('M');
		b.add(8.0);
		//System.out.println(b);
//		b.add(2,"RCB");
		//System.out.println(b);
		
//		a.addAll(b);
//		System.out.println(a);
		a.addAll(2,b);
		System.out.println(a);
		
		//searching the elements
//		System.out.println(a.contains(40));
//		System.out.println(a.indexOf(18));
//		System.out.println(a.lastIndexOf(18));
//		System.out.println(a.indexOf(118));
//		System.out.println(a.containsAll(b));
		//sorting the elements
//		Collections.sort(a);
//		System.out.println(a);
//		Collections.reverse(a);
//		System.out.println(a);
//		//sorting cannot not done in non generic collection
//		Collections.sort(b);
//		System.out.println(b);
		
		LinkedList<String> a1 = new LinkedList(Arrays.asList("Vaibhav","rama","suraj","karthik"));
//		System.out.println(a1);
//		a1.remove("suraj");
//		a1.remove(1);
//		System.out.println(a1);
		
		//a.remove(10);
		//a.removeAll(b);
		a.retainAll(b);
		System.out.println(a);
		
	}


}
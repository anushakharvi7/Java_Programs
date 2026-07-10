package java_training_;
import java.util.*;
public class ArrayListOperations {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(18);
		a.add(40);
		//a.add("Sam");
		//System.out.println(a);
		a.add(1,50);//adding number from index
		//System.out.println(a);
		
		ArrayList b = new ArrayList();
		b.add("Virat");
		b.add(18);
		b.add('M');
		b.add(8.0);
		//System.out.println(b);
		b.add(2,"RCB");
		//System.out.println(b);
		
//		a.addAll(b);
//		System.out.println(a);
		a.addAll(2,b);
// 		System.out.println(a);
		
		//searching the elements
//		System.out.println(a.contains(40));
//		System.out.println(a.indexOf(18));
//		System.out.println(a.lastIndexOf(18));
//		System.out.println(a.indexOf(118));
//		System.out.println(a.containsAll(b));

 		
//		Collections.sort(a);
//		System.out.println(a);
//		Collections.reverse(a);
//		System.out.println(a);
		
		//Sorting cannot be done on non generic collection
//		Collections.sort(b);
//		System.out.println(b);

		ArrayList<String> a1 = new ArrayList(Arrays.asList("Vaibhav","Ramana","Sara","Karthik"));
//		System.out.println(a1);
//		a1.remove("Sara");
//		System.out.println(a1);
//		a.remove(1);
//		System.out.println(a1);
//		a.remove(10);
//		a.removeAll(b);
//		a.retainAll(b);
//		System.out.println(a);
//		

//		Iterator<Integer> i = a.iterator();
//		System.out.println();
		
		
		ListIterator<Integer> l = a.listIterator();
//		while(l.hasNext()) {
//			System.out.println(l.next());
//		}
//		while(l.hasPrevious()) {
//			System.out.println(l.previous());
		
		
	}

}

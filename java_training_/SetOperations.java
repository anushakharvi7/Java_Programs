package java_training_;
import java.util.*;

public class SetOperations {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		System.out.println(h);
//		for(int i:h) {
//			{
//				System.out.println(i);
//			}
//		Iterator<Integer> i= h.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		System.out.println(h.contains(20));
//		h.remove(20);
//		Collections.sort(h);  //sorting the ha set is not posiible
//		System.out.println(h);
		
//		  TreeSet<Integer> t = new TreeSet();
//		  t.add(32);
//		  t.add(52);
//		  t.add(45);
//		  t.add(36);
//		  System.out.println(t);
		
		TreeSet t = new TreeSet(); // not possible
		t.add(12);
		t.add(23.5);
		t.add('d');
		t.add("Hello");
		System.out.println(t);
	}

}

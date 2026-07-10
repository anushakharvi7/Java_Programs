package java_training_;
import java.util.*;

public class MapOperations {

	public static void main(String[] args) {
		TreeMap<Integer,String> h = new TreeMap();
		h.put(100,"Sachin");
		h.put(35,"Virat");
		h.put(79,"Rohit");
		h.put(60,"Dhoni");
		System.out.println(h);//insertion not maintained in HashMap
		//System.out.println(h.get(100));
		
//		h.remove(39);
//		System.out.println(h);
		
//		System.out.println(h.containsKey(85));
//		System.out.println(h.containsValue("Dhoni"));
//		h.replace(20, "De velliers");
//		System.out.println(h);
//		for(int i:h.keySet())
//		{
//			System.out.println(i);
//		}
//		for(String s:h.values())
//		{
//			System.out.println(s);
//		}
		for ( int i:h.keySet())
		{
			System.out.println(i+"->"+h.get(i));
		}
		
	}

}

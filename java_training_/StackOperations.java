package java_training_;
import java.util.*;

public class StackOperations {

	public static void main(String[] args) {
		
		Stack<String> s= new Stack();
		s.push("Tharun");
		s.push("Varun");
		s.push("Arun");
		s.push("Karun");
		System.out.println(s);
		//System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		
//		System.out.println(s.contains("Varun"));
//		System.out.println(s.remove("Arun"));
//		System.out.println(s);
		for(String s1:s) {
			System.out.println(s);
		}
	}

}

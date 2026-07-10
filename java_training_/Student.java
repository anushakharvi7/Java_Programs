package java_training_;
import java.util.*;
public class Student implements Comparable<Student>
{
	String name;
	int rno;
	Student(String name, int rno){
		this.name = name;
		this.rno=rno;
	}
	
	@Override
	public int compareTo(Student s)
	{
		return  this.name.compareTo(s.name);
	
	}
	
	
	@Override
	public String toString()
	{
		return name+" -"+rno;
	}
	@Override
	public boolean equals(Object o) //Object is super most class
	{
		Student s =(Student) o;
		return this.name.equals(s.name)&&this.rno==s.rno;
	}
}
	
class RnoSort implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.rno-s2.rno;
	}
}
class StudentDriver
{
	public static void main(String[] args) {
		ArrayList<Student>a = new ArrayList();
		a.add(new Student("Harsha", 12));
		a.add(new Student("Varsha", 33));
		a.add(new Student("Hardik", 25));
		a.add(new Student("Natasha", 4));
		System.out.println(a);
		
//		for(Student s:a )
//		{
//			System.out.println(s);
//		}
		Student key = new Student("Varsha",23);
		//System.out.println(a.contains(key));
//		a.remove(key);
////		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
		Collections.sort(a, new RnoSort());
		System.out.println(a);
	}
}


package java_training_;

public class ReverseAString {

	public static void main(String[] args) {
		String s ="Hello";
		String res="";
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			res=c+res;     // or 		res=res+c; 	
		}
		System.out.println(res);

	}

}
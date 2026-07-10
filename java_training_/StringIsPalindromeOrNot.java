package java_training_;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		String s ="MALAYALAM";
		String res="";
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			res=c+res;     // or 		res=res+c; 	
		}
		System.out.println(res);
	
		if(res.endsWith(s)) {
			System.out.println(" Palindrome");
		}
		else
		{
			System.out.println("Not a  Palindrome");
		
	}
}
}


//char c1=s.charAt(i);
//char c2=s.charAt(i);
//if(c1==c2)



package java_training_;

public class StringToNumber {

	public static void main(String[] args) {
		String s ="1234";
		int res=0;
		for (int i =0; i<=s.length()-1;i++)
		{
			char c =s.charAt(i);
			int val= c - '0';
			res=res*10+val;
			
		}
		System.out.println(res);

	}

}
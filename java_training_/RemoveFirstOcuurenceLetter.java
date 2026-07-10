package java_training_;
import java.util.*;
public class RemoveFirstOcuurenceLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		System.out.println("Enter character to insert to remove");
		char ch=sc.next().charAt(0);
		int flag=1;
		String res="";
		for(int i=0;i<=s.length()-1;i++) {
			char c = s.charAt(i);
			if(c==ch && flag==1) {
				flag=2;
				continue;
			}
			else {
				res=res+c;
			}
		}
		System.out.println(res);
}
}
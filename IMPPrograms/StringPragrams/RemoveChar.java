// WAP to remove character from the input string which are present
package StringPragrams;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		
		String str = sc.next();
		System.out.println(str);
		
		// remove element of 3rd index
		System.out.println(charRemoveAt(str,3));

	}
	public static String charRemoveAt( String str, int p)
	{
		return str.substring(0,p) + str.substring(p+1);
	}
	

}

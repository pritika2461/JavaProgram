// WAP to reverse a string without using string inbuilt function.
package assignment10;

public class StringReverse 
{

	public static void main(String[] args)
	{
		String str = "Pritika Somase";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0 ;i--)
		{
			rev = rev +str.charAt(i);
		}
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+rev);


	}

}

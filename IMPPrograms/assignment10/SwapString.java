//WAP to swap two string variables using a third variable
package assignment10;

public class SwapString {

	public static void main(String[] args) 
	{
		String str = "";
		String str1 ="Java";
		String str2 = "Program";
		System.out.println("Originally \n str1 : "+str1 + "\n str2 :"+str2);

		str = str1;
		str1 = str2;
		str2 = str;
		
		System.out.println("After reverse \n str1 : "+str1 +"\n str2 :"+str2);
		

	}

}

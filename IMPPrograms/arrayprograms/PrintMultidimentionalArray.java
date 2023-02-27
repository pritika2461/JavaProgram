// WAP to print the multi-dimentional array.
package arrayprograms;

public class PrintMultidimentionalArray 
{

	public static void main(String[] args)
	{
		int arr1[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0; i < arr1.length; i++)
		{
			for(int j= 0; j < arr1[i].length; j++)
			{
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}

	}

}

// WAP to find number is prime or not
package assignment9;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int r, n, res;
		boolean flag =true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		
		n= sc.nextInt();
		for(int i =2; i<n/2; i++)
		{
			res = n%i;
			if(res == 0)
			{
				 flag =false;
				 break;
			}
		}
if(flag)
{
	System.out.println(n +" is a prime number");
}
else
{
	System.out.println(n +" is  not a prime number");
}
	}

}

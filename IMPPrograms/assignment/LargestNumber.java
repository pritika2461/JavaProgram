package assignment;

import java.util.Scanner;

public class LargestNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First  Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second  Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Third  Number :");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("First number is greter");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Second number is greter");
		}
		else
		{
			System.out.println("Third number is greter");
		}

	}

}

package TestPack;

import java.util.Scanner;

interface Printable     // interface 
{
	public void print();   // abstract method
}

interface Calculate
{
	public void cal();
}

class Squre implements Printable,Calculate // implements from printable and calculate interface 
{    int a,s;
	 public void cal()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Number of finding Squre :");
		  a= sc.nextInt();
		  s= a*a;                      
	 }
	 public void print()
	 {   
		 System.out.println("Squre of "+a+" is "+s);
	 }
}

class Cube implements Printable, Calculate
{   
	int a,s;
	public void cal()
	{ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Number of finding Cube :");
		 a= sc.nextInt();
		 
		 s= a*a*a;
	}
	public void print()
	{
		System.out.println("Cube of "+a+" is "+s);
	}
}

public class InterfaceExample
{
   public static void main(String[] args)
   {
	   Squre d= new Squre();
	   d.cal();
	   d.print();
	   
	   Cube c= new Cube();
	   c.cal();
	   c.print();
			   
   }
}


/* output
 
Enter Number of finding Squre :
2
Squre of 2 is 4
Enter Number of finding Cube :
2
Cube of 2 is 8

*/

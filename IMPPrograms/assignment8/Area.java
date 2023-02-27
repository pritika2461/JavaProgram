/* WAP to print the area of rectangle by creating class named 'Area'
 *  taking the values of its length and breadth as parameters of its 
 *  constructor and having a method with named 'returnArea' which returns the area of rectangle. 
length and breadth of rectangle are entered through keyboard */
package assignment8;

import java.util.Scanner;

public class Area 
{
	int l,b;
	void addData()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length ");
	l = sc.nextInt();
	
	System.out.println("Enter Brradth ");
	b = sc.nextInt();
	}
	
	Area(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	void  returnArea()
	{
		System.out.println((l*b));
	}
	public static void main(String[] args) 
	{
       Area a = new Area(10,10);
       a.addData();
       a.returnArea();
    		   
	}

}

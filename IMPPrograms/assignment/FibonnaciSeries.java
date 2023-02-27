package assignment;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) 
	{
	    int a = 0;
	    int b = 1;
	    int c ;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number upto which you want to display fibonacci series ");
	    int num = sc.nextInt();
	    
	    for(int i = 0; i<=num ;i++)
	    {
	    	System.out.print(" "+b);
	        c= a;
	        a= b;
	        b = c+a;    	
	    }
	    

	}

}

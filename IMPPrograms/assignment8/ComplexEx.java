/*print the sum, difference and product of two complex numbers by creating class name complex 
 with separate methods for each operation. whose real and imaginary part are entered by user.*/
package assignment8;

import java.util.Scanner;
class Complex 
{
	static int r, c;
	void add()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter real number");
	    r = sc.nextInt();
	    
	    System.out.println("Enter Complex number ");
	    c = sc.nextInt();
	}
   void sum()
   {
	   System.out.println("Sum = "+(r+c));
   }
   
   void difference()
   {
	   System.out.println("Diffrence = "+(r-c));
   }
   
   void product()
   {
	   System.out.println("Product = "+(r*c));
   }
}
   
public class ComplexEx 
{
	public static void main(String[] args)
	{
		
		Complex c1 = new Complex();
		c1.add();
		c1.sum();
		c1.difference();
		c1.product();

	}

}

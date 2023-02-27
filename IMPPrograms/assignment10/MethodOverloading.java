// WAP to demonstrate method overloading
package assignment10;

public class MethodOverloading 
{
	public void add(int a, int b)
	{
		System.out.println("Addition of a+b :"+(a+b));
	}
	
	// Overload the add method
	public void add(int a, int b, int c)
	{
		System.out.println("Addition of a+b+c :"+(a+b+c));
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading m1 = new MethodOverloading();
		m1.add(10, 20);
		m1.add(10, 20, 30);

	}

}

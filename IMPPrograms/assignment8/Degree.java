/* create a class 'Degree' having a method 'getDigree' that prints 'I got a degree'. 
 * it has two subclasses namely 'Undergraduate' and 'Postgraduate'  each having a method with the 
 * same name as that prints
 *  'I am undergraduate' and 'I am postgraduated' respectively.
 * call the method by creating an object of each of the three classes.*/
 
package assignment8;

class Degree1
{
	void getDegree()
	{
		System.out.println("I got a Degree");
	}
}
class Undergraduate extends Degree1
{
	void print1()
	{
		System.out.println("I am Under graduated");
	}
}

class Postgraduate extends Degree1
{
	void print2()
	{
		System.out.println("I am Post graduated");
	}
}

public class Degree
{
	public static void main(String[] args)
	{
		Degree1 d = new Degree1();
		
		Undergraduate u = new Undergraduate();
		
		Postgraduate p = new Postgraduate();
		
		d.getDegree();
		
		u.print1();
		
		p.print2();

	}

}
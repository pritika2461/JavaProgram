// WAP to create a class with method that print "This is a parent class" and its subclass with another method that print "This is a sub class" now create object for each of class  
package inheritanceProgram;

class ParentClass
{
	void print1()
	{
		System.out.println("This is a Parent class");
	}
}

// extending child class from parent class
class ChildClass extends ParentClass
{
	void print2()
	{
		System.out.println("This is a Child class");
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) 
	{
		// creating object of parent class
		ParentClass p = new ParentClass();
		
		// creating object of child class
		ChildClass c = new ChildClass();
		
		// call method of parent class by object of parent class
		p.print1();
		
		// call method of child class by object of child class
		c.print2();
		
		//call method of parent class by object of child class
		c.print1();

	}

}

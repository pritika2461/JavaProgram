/*Create a class named 'Shape' with a method to print "This is This is shape".

Then create two other classes named 'Rectangle', 'Circle' inheriting the
Shape class, both having a method to print "This is rectangular shape" and
"This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle'
having a method to print "Square is a rectangle". Now call the method of
'Shape' and 'Rectangle' class by the object of 'Square' class.*/

package inheritanceProgram;
// creating shape class
class Shape
{
	void shape()
	{
		System.out.println("This is shape");
	}
}

// create rectangle class and extend it from shape class
class Rectangle extends Shape
{
	void rect()
	{
		System.out.println("This is Rectangular shape");
	}
}

// create circle class and extend from shape class
class Circle extends Shape
{
	void circle()
	{
		System.out.println("This is a Circular shape");
	}
}

// create square class and extend from rectangle class
class Square extends Rectangle
{
	void squre()
	{
	    System.out.println("Square is a rectangle");	
	}
}

public class ShapeProgram 
{
     // main method
	public static void main(String[] args)
	{
		// create object of the square class
        Square s = new Square();
        // calling the method of shape & rectangle class by the object of square class
        s.shape();
        s.rect();
	}

}

/* output
This is shape
This is Rectangular shape
*/
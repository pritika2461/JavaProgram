abstract class AbstractClass
{
	abstract void print();
	
	AbstractClass()
	{
		System.out.println("Default Constructor");
	}
	
	public void show()
	{
		System.out.println("Showing.....");
	}
}

class Paint extends AbstractClass
{
	
	Paint()
	{
		System.out.println("Paint constructor");
	}
	void print()
	{
		System.out.println("Printling........");
	}
}

public class AbstractClassEx
{
	public static void main(String[] args)
	{
		Paint p = new Paint();
	     p.print();
		p.show();
	}
}
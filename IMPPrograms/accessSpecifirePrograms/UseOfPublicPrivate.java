// WAP to illustrate private and public access specifier.
package accessSpecifirePrograms;

public class UseOfPublicPrivate 
{
	// public method is accessible outside the class
	public void add()  
	{
		int a =10;
		int b =20;
		System.out.println("Addition :"+(a+b));
	}
	
	// private method is not accessible outside the class it is for only this class
	private void sub()
	{
		// private variable is not accessible outside this method
		private int a =10;
		int b =20;
		System.out.println("Substraction :"+(a-b));
	}

	public static void main(String[] args)
	{
		UseOfPublicPrivate p = new UseOfPublicPrivate();
		p.add();
		p.sub();
	}

}

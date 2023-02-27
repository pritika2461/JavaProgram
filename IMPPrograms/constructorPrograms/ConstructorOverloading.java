package constructorPrograms;

public class ConstructorOverloading
{
	ConstructorOverloading()   // Constructor 
	{
		System.out.println("This is constructor method.");
	}
	
	ConstructorOverloading(int a)  // overload constructor
	{
		System.out.println("This is method where we overload the constructor");
	}
	

	public static void main(String[] args) 
	{
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading(10);

	}

}

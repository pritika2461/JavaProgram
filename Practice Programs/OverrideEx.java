class Animal
{
	public void eat()
	{
		System.out.println("Parent class");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Child class");
	}
}
public class OverrideEx
{
	public static void main(String[] args)
	{
	     Animal d= new Animal();
		d.eat();
	}
}
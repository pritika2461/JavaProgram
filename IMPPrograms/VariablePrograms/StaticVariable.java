// Java program to show static variable declaration.

package VariablePrograms;

public class StaticVariable 
{
	int id = 101;
	String name = "Pritika";
	
	// static variable that create common memory to all objects
	static String collage ="SND COE & RC, Yeola";

	public static void main(String[] args) 
	{
		StaticVariable s = new StaticVariable();
		System.out.println("ID : "+s.id);
		System.out.println("Name : "+s.name);
		System.out.println("Collage : "+s.collage);

	}

}

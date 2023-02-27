//Java program to illustrate the parameterized constructor.

package constructorPrograms;

public class ParameterizedConstructor
{
	int a,b;
	ParameterizedConstructor(int a, int b)  //ParameterizedConstructor
	{
		this.a = a;
		this.b = b;
		System.out.println("Addition : "+(a+b));
	}
	public static void main(String[] args) 
	{
		ParameterizedConstructor pc = new ParameterizedConstructor(10,20);

	}

}

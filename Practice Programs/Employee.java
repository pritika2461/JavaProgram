public class Employee
{
	int id;        // instance variable
	String name;
	static String Comp_name;        //static variable
     
	static void method1()               //static method
	{
		double sal= 50000; //local variable
		System.out.println(sal);
	}
                   public void method2(int id, String name)
                     {
                            this.id= id;
                            this.name=name;
                         }

	public static void main(String args[])
	{
		Employee e1= new Employee();      //object creation
		e1.id= 10;
		e1.name = "Pritika";
		e1.Comp_name = "Anudip";

	     System.out.println(e1.id);	
	     System.out.println(e1.name);
	     System.out.println(Employee.Comp_name);    // static var access by the class name
	     method1();                                                    // call static method
	     // System.out.println(sal);                            // error to not accesss the local variable
                        
                       Employee e2= new Employee();  
                                    e2.method2(15, "Shraddha");
                        System.out.println(e2.id+" "+e2.name);
                   
	}
             }

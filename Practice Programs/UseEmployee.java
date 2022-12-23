public class UseEmployee
{
    int emp_id;
	String name;
	int salary;
	static int count =0;
	
	UseEmployee(int emp_id, String name, int salary)
	{  
	    System
	   this.emp_id=emp_id;
	   this.name= name;
	   this.salary= salary;
	   count++;
	}
	
	UseEmployee()
	{
	   System.out.println("Id : "+emp_id);
	   System.out.println("Name : "+name);
	   System.out.println("Salary : "+salary);
	   count++;
	}
	
	public String toString()
	{
		return emp_id+ " "+name+ " "+salary;
	}

  public static void main(String[] args)
  { 
     
     Employee e1= new Employee(10,"Pritika", 30000);
	 System.out.println(e1);
	 
	 Employee e2= new Employee(11,"Priti", 20000);
	 System.out.println(e2);
	 
	 System.out.println("count : "+count);


  }
}
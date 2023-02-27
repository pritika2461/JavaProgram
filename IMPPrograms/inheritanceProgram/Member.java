/*Create a class named 'Member' having the following members


Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the
members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
'Employee' and 'Manager' classes have data members 'specialization' and
'department' respectively. Now, assign name, age, phone number, address
and salary to an employee and a manager by making an object of both of
these classes and print the same */
package inheritanceProgram;

class Member1 
{
	     String name;
	     int age;
	     long phone_number;
	     String address;
	     int salary;
	        
		public void printSalary()
		{
			System.out.println("Salary of employee :"+salary);
		}
}

class Employee extends Member1
{
	 String specialization;
	 void print()
	 {
		 System.out.println("Name of Employee : "+name);
		 System.out.println("Age of Employee :"+age);
		 System.out.println("Phone Number of Employee :"+phone_number);
		 System.out.println("Address of Employee :"+address);
		 System.out.println("Salary of Employee :"+salary);
		 System.out.println("Specialization of Employee :"+specialization);
	 }	 
}

class Manager extends Member1
{
	 String department = "Account Department";
	 void print()
	 {
		 System.out.println("Name of Manager : "+name);
		 System.out.println("Age of Manager :"+age);
		 System.out.println("Phone Number of Manager :"+phone_number);
		 System.out.println("Address of Manager :"+address);
		 System.out.println("Salary of Manager :"+salary);
		 System.out.println("Department of Manager :"+department);
	 }
}

public class Member
{
        public static void main(String[] args) 
        {
           Employee e = new Employee();
           e.name = "Pritika";
           e.age = 21;
           e.phone_number = 87664845;
           e.address = "Nashik";
           e.salary = 50000;
           e.specialization = "Java Developer";
           System.out.println();
           e.print();
           System.out.println();
           e.printSalary();

           System.out.println();
           Manager m = new Manager();
           m.name = "Shraddha";
           m.age = 20;
           m.phone_number = 547864845;
           m.address = "Pune";
           m.salary = 230000;
           m.department = "Accounting";
           m.printSalary();
           m.print();
        }
}
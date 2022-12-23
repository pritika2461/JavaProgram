interface Person
{
 public void print();
}

class Student implements Person
{
  public void print()
  {
   System.out.println(" Student class");
  }
}

class Employee implements Person
{
  public void print()
  {
   System.out.println(" Employee class");
  }
}

class Patient implements Person
{
  public void print()
  {
   System.out.println(" Patient class");
  }
}

public class UsePerson
{
  public static void main(String[] args)
  {
    Person p= new Student();
	p.print();
  }
}
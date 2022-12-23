public class ConstructorDemo
{
   public ConstructorDemo()
{
    System.out.println("Default Constructor"); 
}

 public ConstructorDemo1(int a,int b)
{
    System.out.println("Parameterized constructor"); 
}

 public ConstructorDemo2(int a, double b)
{
    System.out.println("parameterized double constructor"); 
}
public static void main(String[] args)
{
ConstructorDemo c1 =new  ConstructorDemo();
 c1.ConstructorDemo();
 c1.ConstructorDemo1(10,20);
 c1.ConstructorDemo2(10,21.2);
 
}
}
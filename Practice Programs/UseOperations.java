 class Operations
{
    int a,b;  
   public int add(int a, int b)
    { 
       return a+b;
    }

public double add(int a, int b )
    { 
       return a+b;
    }
public class UseOperations
{
  public static void main(String[] args)
{
  Operations s= new Operations();
System.out.println(s.add(10,20));
  
}
}
}
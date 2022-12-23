class InstanceEx
{
   int a,b;
   
    // instance block
    {
	  int a=10,b=20;
      System.out.println("A :"+a+" B : "+b);
    }
	
	

	public void print()
	{
	   System.out.println("A :"+a+" B : "+b);
	}
	
	InstanceEx()
	{  
	  a=20;
	  b=30;
	  System.out.println("Constructor ");
	}	
	
 }
 
 
 public class UseInstanceEx
 {
     public static void main(String[] args)
      {
         InstanceEx g1= new InstanceEx();
		 g1.print();
         
  }
 }

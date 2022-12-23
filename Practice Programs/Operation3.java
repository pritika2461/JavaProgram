class Operation1
{
    public void add()
      {
              System.out.println("Addition"); 
       }
}

class Operation2 extends Operation1
{

         public void add()
      {
              System.out.println("Addition"); 
       }
          public void add1()
      {
              System.out.println("Substraction"); 
       }
}


public class Operation3
{
          public static void main(String args[])
            {
                Operation2 s1 = new Operation2();
                   s1.add();

             }
}
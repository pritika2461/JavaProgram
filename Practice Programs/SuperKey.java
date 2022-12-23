  class Demo
{
      String name = "Parent Class Variable"; 
      Demo()
       {
               System.out.println("I am Demo class Constructor");
        }
    
         public void add()
          {
                 System.out.println("Add method");
           }
}

class SuperKey1 extends Demo
{
     String name= "Child class Variable"; 

        SuperKey1()
          {
                       super();
                       
           }
            SuperKey1(int a)
          {
                       this();
                       System.out.println("I am SuperKey class Constructor");
           }

         
           public void sub()
            {
                            System.out.println("Sub Class");
             }

public void printvar()
               {
                 System.out.println(this.name);
                System.out.println(super.name);
                }
}

public class SuperKey
{
   public static void main(String[] args)
{
   SuperKey1 sk= new SuperKey1(12);
          sk.add();    
          sk.sub();
          sk.printvar();
}
}
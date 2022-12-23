  class ParentClass
{
      String name = "Parent Class Variable"; 
      ParentClass()
       {
               System.out.println("I am Demo class Constructor");
        }
    
         public void add()
          {
                 System.out.println("Add method");
           }
}

class ChildClass extends ParentClass
{
     String name= "Child class Variable"; 

        ChildClass()
          {
                       super();
                       
           }
            ChildClass(int a)
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

public class SuperKeyEx
{
   public static void main(String[] args)
    {
          ChildClass sk= new ChildClass(12);
          sk.add();    
          sk.sub();
          sk.printvar();
}
}
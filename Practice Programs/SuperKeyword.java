class Animal
{
       String color= "White";
        Animal()
        {
           System.out.println("I am Animal Class");
           }

        public void  add()
          {
               System.out.println("I am Parent Class");
          }
}

class Dog extends Animal
{ 
         String color="Pink";
           Dog()
                {
                   super();
                    System.out.println("I am Dog Class");
                 }

      Dog(int a)
      {
          this();
          System.out.println("I am Parameterized Dog class");
 }
            
        public void print()
             {
                     
                    System.out.println(color);
                    System.out.println(super.color);
               }
}
public class SuperKeyword
{
 public static void main(String[] args)
{
   Dog d= new Dog();
Dog d1= new Dog(2);
     d.print();
}
}
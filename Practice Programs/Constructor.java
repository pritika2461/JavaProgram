public class Constructor
{
        static int count =0;
        int id;
        String name;
        String designation;
        Constructor()
            {
                System.out.println("I am default constructor...........");
                count++;
             }

       Constructor(int id, String name,String designation)
           {
               System.out.println("I am parameterized constructor...........");
               this.id= id;
                this.name= name;
                this.designation= designation;
                count++;
            }


         public String toString()
              { 
                   return id+" "+name+ " "+designation;
               } 

   public static void main(String[] args)
    {
          
          Constructor c1 = new Constructor();

           Constructor c2 =new Constructor(15,"Pritika","Developer");
           System.out.println(c2);

       System.out.println("Number of Object : "+count);
    }
}


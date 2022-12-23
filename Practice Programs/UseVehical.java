
interface Vehical
{
     void no_seat();
     void no_Wheel();
	 
}

class Bike implements Vehical
{
	    
        public void no_seat()
         {
             System.out.println("Seat : 2");
         }
         
		  public void no_Wheel()
          {
               System.out.println("Wheels : 2");
          }
       
}


class Bus implements Vehical
{
        public void no_seat()
         {
             System.out.println("Seat : 12");
         }
  
        public void no_Wheel()
          {
               System.out.println("Wheels : 6");
          }
}


public class UseVehical
{
  public static void main(String[] args)
  {
    Bike b= new Bike();
	b.no_seat();
	b.no_Wheel();
	
	Bus b1 = new Bus();
	b1.no_seat();
	b1.no_Wheel();
  }
}
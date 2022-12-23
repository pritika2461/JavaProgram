public class WrapperEx
 {
     public static void main(String[] args)
      {
        int i=10;   // primitive data type
		Integer ii= new Integer(i); // boxing, wrapping
		int j= ii.intValue(); // unboxing
         
		 Integer value =i; //Autoboxing
		 int k= value; // AutoUnboxing
		 
		 String s="123";
		 int n=Integer.parseInt(s);
		 System.out.println(ii);
		 System.out.println(n);
  }
 }
 
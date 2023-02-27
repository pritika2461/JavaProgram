// Java program to show local variable declaration.

package VariablePrograms;

public class LocalVariable 
{	
         public void add()
         {
        	 // Local variable this are only accessible within the add() method
         	 int a=10;
        	 int b = 20;
      
        	 System.out.println("Addition of a+b = "+(a+b));
         }
         
         public static void main(String[] args)
     	{
        	 LocalVariable lv = new LocalVariable();
        	 lv.add();
	     }

}

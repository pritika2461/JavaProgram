// Java program to show Instance  variable declaration.
package VariablePrograms;

public class InstanceVar
{
     // instance variable that are accessible within all class
     int a =10;
     int b =20; 
     
	 public void add()
     {
    	 System.out.println("Addition of a+b = "+(a+b));
    }
    
    public static void main(String[] args)
	{
    	InstanceVar lv = new InstanceVar();
   	 lv.add();
    }

}

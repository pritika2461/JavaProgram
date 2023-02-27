package assignment;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) 
	{
	     System.out.println("Simple Calculator");
	     System.out.println("Which operation you want to perform \n 1) Addition \n 2) Substraction \n 3) Multiplication \n 4) Division \n 5) Modulas");
         
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter Your Choice :");
	     int ch = sc.nextInt();
	     
	     System.out.println("Enter Frist Number ");
	     int fn = sc.nextInt();
	     
	     System.out.println("Enter Second number");
	     int sn = sc.nextInt();
	     
	     int result;
         switch(ch)
         {
         case 1:
         {
        	 result = fn + sn;
        	 System.out.println("Addition of "+fn +"+"+sn + " is "+result);
        	 break;
         }
         
         case 2:
         {
        	 result = fn - sn;
        	 System.out.println("Substraction of "+fn +"-"+sn + " is "+result);
        	 break;
         }
         
         case 3:
         {
        	 result = fn * sn;
        	 System.out.println("Mutiplication of "+fn +"*"+sn + " is "+result);
        	 break;
         }
         
         case 4:
         {
        	 result = fn / sn;
        	 System.out.println("Division of "+fn +"/"+sn + " is "+result);
        	 break;
         }
         
         case 5:
         {
        	 result = fn % sn;
        	 System.out.println("Moduas of "+fn +"%"+sn + " is "+result);
        	 break;
         }
         }
	}

}

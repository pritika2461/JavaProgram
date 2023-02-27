//Write a program to compute sum and average of array elements.
package arrayprograms;

public class SumAndAvarege 
{

	public static void main(String[] args) 
	{
	  int arr[] = {10,20,30,40,50};
	  int sum =0;
	  
	  for (int i=0; i< arr.length; i++)
	  {
		  sum = sum +arr[i];
	  }
	  System.out.println("Sum of Array Elements are : "+sum);
	  int avg = sum / arr.length;
	  System.out.println("Avarage of array element is : "+avg);
	}
    
}

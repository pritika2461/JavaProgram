//WAP to convert a string to an integer array
package StringPragrams;
import java.util.*;

public class StringToArray 
{
	public static void main(String args[]) 
	{
	      String [] str = {"123", "345", "437", "894"};
	      int size = str.length;
	      int [] arr = new int [size];
	      for(int i=0; i<size; i++) {
	         arr[i] = Integer.parseInt(str[i]);
	      }
	      System.out.println(Arrays.toString(arr));
	   }
}

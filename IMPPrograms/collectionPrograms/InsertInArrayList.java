// WAP to insert an element into the array list at the top possition.
package collectionPrograms;

import java.util.ArrayList;

public class InsertInArrayList {

	public static void main(String[] args)
	{
		// creating array list
		ArrayList al = new ArrayList();
		
		// insert element in array list
		al.add("Monday");
		al.add("Thusday");
		al.add("Wednesday");
		
		// inserting element at top (0 index) position.
		al.add(0,"Sunday");
		
		System.out.println(al);
		

	}

}

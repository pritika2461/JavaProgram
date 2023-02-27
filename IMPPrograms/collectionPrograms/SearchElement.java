// WAP to search to search an element in array list
package collectionPrograms;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		al.add("Red");
		al.add("Black");
		al.add("White");
		al.add("Vialet");
		al.add("Yellow");
		al.add("Pink");
		
		// search the red color is present or not in given array list
		System.out.println(al.contains("Red"));

	}

}

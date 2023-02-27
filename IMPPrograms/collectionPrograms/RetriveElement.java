// WAP to retrieve element from a given array list
package collectionPrograms;

import java.util.ArrayList;

public class RetriveElement {

	public static void main(String[] args)
	{
	   ArrayList al = new ArrayList();
	   al.add("Red");
		al.add("Black");
		al.add("White");
		al.add("Vialet");
		al.add("Yellow");
		al.add("Pink");
		
		// print array list
		System.out.println(al);
		
		// print element of 3rd index 
		System.out.println(al.get(3));

	}

}

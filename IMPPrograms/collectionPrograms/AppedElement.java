// WAP to append the element to the and of the linked list
package collectionPrograms;

import java.util.LinkedList;

public class AppedElement {

	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Monday");
		ll.add("Thusday");
		ll.add("Wednesday");
		ll.add("Thursday");
		
		System.out.println(ll);
		
		// add element at the last of linked list
		ll.addLast("Friday");
		
		System.out.println(ll);

	}

}

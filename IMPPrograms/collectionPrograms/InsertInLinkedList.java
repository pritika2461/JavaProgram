// WAP to insert element at the end of the linked list
package collectionPrograms;

import java.util.LinkedList;

public class InsertInLinkedList {

	public static void main(String[] args)
	{
		// Creating an linked list
	    LinkedList<String> ll = new LinkedList();
	    ll.add("Java");
	     ll.add("CPP");
	    ll.add("Python");
	    System.out.println("Linke+d List: " + ll);
	    
	    // adding the element in linked list
	    ll.addLast("Ruby");
	    System.out.println("Linked list after adding "+ll);

	}

}

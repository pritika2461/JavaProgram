// WAP to iterate thought all elements of linked list

package collectionPrograms;
import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) 
	{
		// Creating an linked list
	    LinkedList<String> ll = new LinkedList();
	    ll.add("Java");
	     ll.add("JavaScript");
	    ll.add("Python");
	    System.out.println("Linked List: " + ll);
	    
	    Iterator<String> it = ll.descendingIterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }


	}

}

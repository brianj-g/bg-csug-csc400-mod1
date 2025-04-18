
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {
	
	Node first;  // First item in the linked list
	int num;  // Counter variable
	
	// Method: Add a node to the linked list
	public void add(T item) {
		Node node = new Node();
		// Populate the new node with added item, and point to the original 'first'
		node.item = item;
		node.next = first;
		
		// Set the new node as first and increment the counter
		first = node;
		num++;
	}
	
	// Method: Remove a node from the linked list
	public void remove(T item) {
		// Ensure bage is not empty
		if (first == null) return;
		
		// Check to see if item is the first node and remove it from the list if so
		if (first.item == item) {
			first = first.next;
			num--;
			return;
		}
		
		// Instantiate nodes to prepare for removing
		Node current = first.next;
		Node previous = first;
		
		// Traverse through the linked list until either found or no more items
		while (current != null) {
			// Remove the item and end loop if found
			if (current.item == item) {
				previous.next = current.next;
				num--;
				return;
			}
			// Continue through the list if not yet found
			previous = current;
			current = current.next;
		}
	}
	
	// Method: Check for existence of a value
	public boolean contains(T item) {
		Node current = first;
		
		while(current != null) {
			if (current.item == item) {
				return true;
			}
			// advance to next node if not found
			current = current.next;
		}
		
		// return false if item is not found
		return false;
	}
	
	// Method: Count occurences of a value
	public int count(T item) {
		int c = 0; // initialize counter
		
		// Traverse the linked list and increment the counter when occurrences are found
		Node current = first;
		while (current != null) {
			// Increment the counter any time the item is found
			if(current.item == item) {
				c++;
			}
			// Advance to the next node
			current = current.next;
		}
		
		// Return the total count of the requested item
		return c;
	}
	
	// Nested class for linked list nodes
	class Node {
		T item;
		Node next;
	}
	
	// Nested class to implement the iterator
	class BagIterator implements Iterator<T>{
		Bag<T>.Node current = first; // Nested class allows access to Bag's members
		
		// If 'current' is null, then the iteration is complete
		public boolean hasNext() {
			return (current != null);
		}
		
		// return the current item and move to the next node
		public T next() {
			if (!hasNext()) throw new NoSuchElementException("No next element");
			
			T element = current.item;
			current = current.next;
			
			return element;
		}
	}
	
	// Function to return an instance of the iterator
	public Iterator<T> iterator(){
		return new BagIterator();
	}
}

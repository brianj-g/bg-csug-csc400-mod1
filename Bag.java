import java.util.Iterator;

public class Bag<T> implements Iterator<T> {
	
	class Node<T> {
		T item;
		Node<T> next;
	}
}

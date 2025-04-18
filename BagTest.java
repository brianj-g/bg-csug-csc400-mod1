
public class BagTest {
	
	// Iterate through the bag and print each item
	static <T> void printBag(Bag<T> bag) {
		for (T item : bag) {
			System.out.println(item);
		}
	}
	
	// Use the Bag's "contains()" method to check that a specific value exists at least once
	static <T> void containsTest(T myItem, Bag<T> myBag) {
		if (myBag.contains(myItem)) {
			System.out.println("Bag contains '" + myItem + "'.");
		} else {
			System.out.println("Bag does NOT contain '" + myItem + "'.");
		}
	}
	
	// Use the Bag's "count()" method to count occurrences of a specific value
	static <T> void countTest(T myItem, Bag<T> myBag) {
		System.out.printf("Bag contains %d occurences of '%s'.\n", myBag.count(myItem), myItem);
	}
	
	// Main function
	public static void main(String args[]) {
		// Create an instance of Bag
		Bag<String> myBag = new Bag<String>();
		
		// For ease of testing, an array is used to populate words into the Bag
		String[] wordList = {"this", "is", "a", "test", "a", "is", "this", "is"};
		
		// Iterate through the array and use the "add()" function to add items to the Bag
		for (String word : wordList) {
			myBag.add(word);
		}
		
		// Print out the initial contents of the Bag
		System.out.println("Printing the initial Bag:");
		printBag(myBag);
		System.out.println();
		
		// Test the Bag "contains()" method
		System.out.println("Testing the 'contains()' method:");
		containsTest("test", myBag);
		containsTest("a", myBag);
		containsTest("not", myBag);
		containsTest("the", myBag);
		System.out.println();
		
		// Test Bag's "count()" method
		System.out.println("Testing the 'count()' method:");
		countTest("this", myBag);
		countTest("is", myBag);
		countTest("a", myBag);
		countTest("test", myBag);
		System.out.println();
		
		// Remove an item
		System.out.println("Testing the 'remove()' method:");
		myBag.remove("is");
		System.out.println();
		System.out.println("New Bag contents:");
		printBag(myBag);
		
		// Check the contains() and count() methods again
		System.out.println("Testing the successful removal:");
		containsTest("is", myBag);
		countTest("is", myBag);

	}
}

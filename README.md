# Java Bag Data Structure (Multiset)

This project is a Java implementation of a **Bag Abstract Data Type (ADT)**.  
A Bag is a collection that allows **duplicate elements** and does **not enforce any particular order**.

## Features

- Add elements to the Bag
- Remove a single occurrence of an element
- Check if an element exist
- Count how many times an element appears
- Iterate through the Bag using Java's enhanced `for-each` loop

## Files

```
Bag.java       // Contains both the Bag<T> class and the BagMain class for testing
```

## Usage

1. **Compile and run the project**:

```bash
javac Bag.java
java BagMain
```

2. **Expected Output**:

```
Printing the initial Bag...
is
this
is
a
test
a
is
this

Testing the 'contains()' method...
Bag contains 'test'
Bag contains 'a'
Bag does NOT contain 'not'
Bag does NOT contain 'the'

Testing the 'count()' method...
Bag contains 2 occurences of 'this'
Bag contains 3 occurences of 'is'
Bag contains 2 occurences of 'a'
Bag contains 1 occurences of 'test'

Removing one occurrence of the word 'test' from the Bag...
New Bag contents:
is
this
is
a
a
is
this

Testing the successful removal...
Bag does NOT contain 'test'
Bag contains 0 occurences of 'test'
```

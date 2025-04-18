# Java Bag Data Structure (Multiset)

This project is a Java implementation of a **Bag Abstract Data Type (ADT)**, also known as a **multiset**.  
A Bag is a collection that allows **duplicate elements** and does **not enforce any particular order**.

## Features

- Add elements to the Bag
- Remove a single occurrence of an element
- Check if an element exists
- Count how many times an element appears
- Iterate through the Bag using enhanced `for-each` loop

## Technologies

- Java 17+
- Standard `java.util.Iterator` interface

## File Structure

```
Bag.java       // Implementation of the Bag<T> class and custom iterator
BagTest.java   // Demonstrates usage of the Bag class and validates functionality
```

## Usage

1. **Compile and run the project**:

```bash
javac Bag.java BagTest.java
java BagTest
```

2. **Expected Output** (sample):

```
Printing the initial Bag:
is
this
is
a
test
a
is
this

Testing the 'contains()' method:
Bag contains 'test'
Bag contains 'a'
Bag does NOT contain 'not'
Bag does NOT contain 'the'

Testing the 'count()' method:
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
Testing the successful removal:
Bag does NOT contain 'test'
Bag contains 0 occurences of 'test'
```

## Pseudocode

A fully commented and structured pseudocode version of the Bag and its operations is also included as part of this project for conceptual clarity.

## Learning Outcomes

- Reinforced understanding of Abstract Data Types and linked list implementations
- Gained experience using generics and iterators in Java
- Practiced clean design, encapsulation, and unit-level testing

## Author

**Brian Gunther**  
CSU Global | CSC400 – Data Structures and Algorithms  
April 2025

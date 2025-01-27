## Iterator Design Pattern

The Iterator Design Pattern is a behavioral design pattern that provides a way to sequentially access elements of a collection (e.g., a list, array, or custom data structure) without exposing the underlying structure.

The key idea is to decouple the iteration logic from the collection itself. This allows different types of collections to implement their own iteration mechanisms.

# Key Components of Iterator Pattern
1. Iterator Interface: Defines the methods for accessing and traversing elements, such as next() and hasNext().

2. Concrete Iterator: Implements the Iterator interface for a specific collection.

3. Collection Interface: Defines the method to return an iterator, such as createIterator().

4. oncrete Collection: Implements the Collection interface and provides the iterator for its data structure.

# Advantages
- Hides the underlying collection structure.
- Provides a consistent way to traverse different types of collections.
- Simplifies code by handling iteration logic in one place.

# Key Points
- The ShoppingCart class does not expose its internal structure (the list of items).
- The iteration logic is encapsulated within the CartIterator class, keeping the collection code clean and focused.

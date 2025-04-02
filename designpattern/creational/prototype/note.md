# Prototype Design Pattern
---
## What is the Prototype Design Pattern?
The Prototype Pattern is a creational design pattern that allows cloning of existing objects without creating new instances from scratch. This is useful when object creation is costly (in terms of performance, resources, or complexity).

Instead of constructing an object using new, the Prototype Pattern lets us copy an existing object.

---
## Key Concepts
- Prototype Interface: Defines the method for cloning objects.
- Concrete Prototype: Implements the cloning mechanism.
- Client: Uses the prototype to create new objects without knowing their class details.
---
## Advantages
✅ Improves Performance – Avoids the expensive cost of creating objects from scratch.

✅ Encapsulation – Hides the complexity of object creation.

✅ Reduces Subclassing – Instead of creating multiple subclasses, objects can be cloned and modified dynamically.

---
## Example in Java: Creating a Cloneable Shape Object
Let's implement a Prototype Pattern to create different Shape objects (Circle, Rectangle, and Square) by cloning instead of using new.


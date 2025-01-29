# 1. Shallow Copy
A shallow copy creates a new object, but it copies only the references of nested objects rather than duplicating them. This means that changes in the nested objects of the copied instance will reflect in the original instance.

## Example of Shallow Copy

``` java
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class PersonShallow implements Cloneable {
    String name;
    Address address;

    public PersonShallow(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Implementing Shallow Copy using clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Default implementation performs a shallow copy
    }

    public void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        PersonShallow person1 = new PersonShallow("John", address);

        // Creating a shallow copy
        PersonShallow person2 = (PersonShallow) person1.clone();

        // Changing the city in person2
        person2.address.city = "Los Angeles";

        // Display both objects
        person1.display();  // Output: Name: John, City: Los Angeles
        person2.display();  // Output: Name: John, City: Los Angeles
    }
}

```

## Explanation
- The clone() method performs a shallow copy.
- person2 gets a new instance of PersonShallow, but the Address reference is shared.
- Changing person2.address.city affects person1.address.city since both refer to the same memory location.

# 2. Deep Copy
A deep copy creates a completely independent duplicate of the object, including all nested objects. Any changes in the copied object do not affect the original.

## Example of Deep Copy
``` java
class AddressDeep {
    String city;

    public AddressDeep(String city) {
        this.city = city;
    }

    // Implementing deep copy for Address
    public AddressDeep deepCopy() {
        return new AddressDeep(this.city);
    }
}

class PersonDeep implements Cloneable {
    String name;
    AddressDeep address;

    public PersonDeep(String name, AddressDeep address) {
        this.name = name;
        this.address = address;
    }

    // Implementing Deep Copy using clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonDeep cloned = (PersonDeep) super.clone();
        cloned.address = this.address.deepCopy();  // Manually cloning Address
        return cloned;
    }

    public void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressDeep address = new AddressDeep("New York");
        PersonDeep person1 = new PersonDeep("John", address);

        // Creating a deep copy
        PersonDeep person2 = (PersonDeep) person1.clone();

        // Changing the city in person2
        person2.address.city = "Los Angeles";

        // Display both objects
        person1.display();  // Output: Name: John, City: New York
        person2.display();  // Output: Name: John, City: Los Angeles
    }
}


```
## Explanation
- person2 gets a new instance of PersonDeep and a new instance of AddressDeep.
- Changes to person2.address.city do not affect person1.address.city because both refer to different memory locations.

##  Key Differences: Shallow Copy vs Deep Copy

![Alt text](https://github.com/gauravdubey/DesignPatternExample/blob/main/images/shallowvsDeepCopy.png)

## When to Use Which?
- Use Shallow Copy when:
    - You don't need separate copies of nested objects.
    - The nested objects are immutable (e.g., String).
- Use Deep Copy when:
    - Each copy should be completely independent.
    - You're working with modifiable nested objects.

## Conclusion
- Shallow Copy is faster but risky if modifications are needed.
- Deep Copy ensures full independence but requires extra effort.
- Use clone() for shallow copy and manually copy nested objects for deep copy.



# Factory Design Pattern in Java
The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

This pattern removes the responsibility of instantiating objects from the client code and delegates it to a factory class.

## Key Concepts
1. Factory Method: A method that creates and returns objects.
2. Product (Interface/Abstract Class): Defines the contract for the objects the factory will create.
3. Concrete Products: The actual implementations of the product interface.
4. Factory Class: Responsible for creating objects based on provided input.

## Advantages
- Encapsulation: Hides object creation logic from the client.
- Loose Coupling: The client is not directly dependent on concrete classes.
- Scalability: New product types can be added without modifying existing code.

## Example in Java: 
## Step 1: Define the Employee Interface
``` java
public interface Employee {

    int salary();
}
```

## Step 2: Create Concrete Product Classes
``` java
// AndroidDeveloper concrete Class
public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.print("Getting Android Developer Salary : ");
        return 50000;
    }
}

// WebDeveloper concrete Class
public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.print("\nGetting Web Developer Salary : ");
        return 40000;
    }
}


```

## Step 3: Create the Factory Class
The Factory Class decides which Developer object to create based on the input.

```java
public class EmployeeFactory {

    public static Employee getEmployee(String empType){
        if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }else {
            return null;
        }
    }
}
```

## Step 4: Client Code Using the Factory
```java

public class DeveloperClientMain {

    public static void main(String[] args) {
        Employee employee= EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = employee.salary();
        System.out.print(salary);

        Employee webEmployee = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salaryWeb = webEmployee.salary();
        System.out.print(salaryWeb);
    }
}

```

## Key Takeaways
- Encapsulation of Object Creation: The NotificationFactory encapsulates the logic for creating Notification objects.
- Loose Coupling: The client (FactoryPatternExample) does not depend on concrete classes (SMSNotification, EmailNotification, PushNotification).
- Scalability: If we need a new notification type, we only add a new class, without modifying existing code.

## Use Cases of Factory Pattern in Java & Android
- Android View System: LayoutInflater uses a factory to create UI elements dynamically.
- Database Connections: DriverManager.getConnection() in JDBC uses a factory pattern.
- Dependency Injection Frameworks: Dagger and Hilt use factories to create dependencies dynamically.


# Strategy Design Pattern
The Strategy Design Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern enables the algorithm to vary independently from the clients that use it.

## Key Concepts
1. Context: The class that uses a strategy.
2. Strategy Interface: Defines a common interface for all supported algorithms.
3. Concrete Strategies: Implement the strategy interface, each defining a specific algorithm.
4. Client: Configures the context with a strategy and invokes the context's methods.

## Advantages
- Promotes the Open/Closed Principle by allowing new algorithms to be added without modifying existing code.
- Simplifies code by delegating behavior to different classes.
- Encourages the use of composition over inheritance.

## Example in Java
Imagine a Payment System where you want to support multiple payment methods like Credit Card, PayPal, and Google Pay. The strategy pattern allows you to encapsulate the logic for each payment method into its own class.

**Step 1: Define the Strategy Interface**<br/>
The interface defines a method for making a payment.

``` java
interface PaymentStrategy {
    void pay(int amount);
}

```
**Step 2: Create Concrete Strategy Classes**<br/>
Each class implements the payment logic for a specific method.

**Credit Card Payment:**

``` java
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using Credit Card: " + cardNumber);
    }
}

````

**PayPal Payment:**

``` java

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using PayPal account: " + email);
    }
}

```

**Google Pay Payment:**

``` java

class GooglePayPayment implements PaymentStrategy {
    private String phoneNumber;

    public GooglePayPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using Google Pay linked to phone: " + phoneNumber);
    }
}


````

**Step 3: Create the Context Class**<br/>
The ShoppingCart class uses a PaymentStrategy to complete the payment process.

``` java
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set!");
        }
        paymentStrategy.pay(amount);
    }
}


````
**Step 4: Use the Strategy Pattern in the Client** <br/>
``` java
public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(100); // Paid 100 USD using Credit Card.

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(200); // Paid 200 USD using PayPal.

        // Pay using Google Pay
        cart.setPaymentStrategy(new GooglePayPayment("9876543210"));
        cart.checkout(300); // Paid 300 USD using Google Pay.
    }
}


````
## Output
``` java

Paid 100 USD using Credit Card: 1234-5678-9876-5432
Paid 200 USD using PayPal account: user@example.com
Paid 300 USD using Google Pay linked to phone: 9876543210


````

## Key Takeaways
1. Dynamic Behavior: The ShoppingCart class doesn't contain payment logic. It delegates payment tasks to the appropriate PaymentStrategy.
2. Flexibility: Adding new payment methods is straightforward—create a new class implementing PaymentStrategy.
3. Encapsulation: Each payment algorithm is encapsulated in its own class, making the code easy to understand and maintain.

# Adapter Design Pattern

- The Adapter Design Pattern is a structural design pattern that allows two incompatible interfaces to work together. It acts as a bridge between the client and a service, enabling objects with different interfaces to collaborate.

**Key Concepts**<br/>
- Target Interface: The interface expected by the client.
- Adapter: A class that implements the target interface and translates the client’s requests into a format that the adaptee can understand.
- Adaptee: The existing interface that needs adapting.
- Client: The code that interacts with the target interface.

**Advantages**<br/>
- Promotes code reusability by adapting incompatible interfaces.
- Decouples the client from the implementation details of the adaptee.

**Example in Java** <br/>
Imagine you are building a payment system where your app needs to support both Stripe and PayPal payment gateways. These two gateways have different APIs. By using the Adapter Pattern, you can create a unified interface for payment processing.

**Step 1: Define the Target Interface**
- The PaymentProcessor interface is what the client expects.

```java
interface PaymentProcessor {
    void pay(int amount);
}
```
**Step 2: Create the Adaptee Classes**<br/>
These are the existing payment gateways with their unique APIs.

**Stripe Payment Gateway:**
``` java
class StripePayment {
    public void makePayment(int amountInCents) {
        System.out.println("Paid " + amountInCents / 100 + " USD using Stripe.");
    }
}

```
**PayPal Payment Gateway:**

``` java
class PayPalPayment {
    public void sendPayment(double amount) {
        System.out.println("Paid " + amount + " USD using PayPal.");
    }
}

```
**Step 3: Create the Adapter Classes** <br/>
These adapters translate the PaymentProcessor interface calls into the appropriate methods of the adaptee classes.

**Stripe Adapter:**
``` java
class StripeAdapter implements PaymentProcessor {
    private final StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(int amount) {
        stripePayment.makePayment(amount * 100); // Convert dollars to cents
    }
}


```
**PayPal Adapter:**<br/>
``` java
class PayPalAdapter implements PaymentProcessor {
    private final PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void pay(int amount) {
        payPalPayment.sendPayment(amount); // PayPal accepts dollars
    }
}


```
**Step 4: Use the Adapters in the Client** <br/>
``` java
public class PaymentClient {
    public static void main(String[] args) {
        // Stripe Payment
        StripePayment stripePayment = new StripePayment();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripePayment);
        stripeAdapter.pay(50); // Pay 50 USD

        // PayPal Payment
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalPayment);
        payPalAdapter.pay(75); // Pay 75 USD
    }
}

```
## Output
``` java
Paid 50 USD using Stripe.
Paid 75.0 USD using PayPal.

````
## Key Takeaways
- The PaymentProcessor interface provides a unified way for the client to interact with different payment gateways.
- The StripeAdapter and PayPalAdapter adapt the incompatible APIs of StripePayment and PayPalPayment to the PaymentProcessor interface.
- The client code remains clean and unaffected by the differences in the underlying payment gateway implementations.

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

**Step 1:** Define the Target Interface
- The PaymentProcessor interface is what the client expects.

interface PaymentProcessor {
    void pay(int amount);
}


# Command Design Pattern
The Command Design Pattern is a behavioral design pattern that turns a request into an object, allowing you to parameterize objects with different requests, delay execution of a request, or support undoable operations.

This pattern encapsulates a request as an object, decoupling the sender (who invokes the request) from the receiver (who executes the request).

## Key Components
1. Command: An interface or abstract class that declares the execute() method.
2. Concrete Command: Implements the Command interface, linking a receiver with a specific action.
3. Receiver: The object that performs the actual work when the command is executed.
4. Invoker: Stores the command and invokes the execute() method.
5. Client: Configures the objects and triggers the actions via the invoker.

## Advantages
- Decouples the sender and receiver.
- Supports undo/redo operations.
- Simplifies complex interactions by encapsulating requests.

**Example in Java** <br/>
Imagine a Home Automation System where a remote control sends commands to control various appliances like lights and fans. Each button on the remote corresponds to a specific command.

**Step 1: Define the Command Interface** <br/>
``` java
interface Command {
    void execute();
}
```
**Step 2: Create Receiver Classes** <br/>
These classes perform the actual work.

**Light Receiver:**
``` java

class Light {
    public void turnOn() {
        System.out.println("The light is ON.");
    }

    public void turnOff() {
        System.out.println("The light is OFF.");
    }
}

```
**Fan Receiver:** <br/>
``` java
class Fan {
    public void start() {
        System.out.println("The fan is ON.");
    }

    public void stop() {
        System.out.println("The fan is OFF.");
    }
}


```
**Step 3: Create Concrete Command Classes**<br/>
These classes implement the Command interface and define the actions.

**Light On Command:**
``` java

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

```
**Light Off Command:**<br/>
``` java
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

```
**Fan On Command:**<br/>
``` java
class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }
}

```
**Fan Off Command:**<br/>
``` java
class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}

 
```
**Step 4: Create the Invoker**<br/>
The remote control class stores and invokes commands.

``` java
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

```
**Step 5: Use the Pattern in the Client**<br/>
``` java
public class HomeAutomationTest {
    public static void main(String[] args) {
        // Receivers
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);
        Command fanOff = new FanOffCommand(ceilingFan);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Test Light Commands
        remote.setCommand(lightOn);
        remote.pressButton(); // The light is ON.

        remote.setCommand(lightOff);
        remote.pressButton(); // The light is OFF.

        // Test Fan Commands
        remote.setCommand(fanOn);
        remote.pressButton(); // The fan is ON.

        remote.setCommand(fanOff);
        remote.pressButton(); // The fan is OFF.
    }
}

```
## Output
``` java
The light is ON.
The light is OFF.
The fan is ON.
The fan is OFF.

```
## Key Takeaways
1. Decoupling: The RemoteControl (Invoker) is decoupled from the Light and Fan (Receivers). It only knows about the Command interface.
2. Flexibility: Adding new devices (e.g., TV, AC) or commands (e.g., dim lights) requires creating new Command and Receiver classes without modifying existing code.
3. Extensibility: Supports undo/redo functionality by storing executed commands in a stack.

   
